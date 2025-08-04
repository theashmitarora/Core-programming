import java.util.Scanner;
public class FrequencyWithUnique {
    public static char[] uniqueChars(String s) {
        char[] arr = new char[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) arr[count++] = ch;
        }
        char[] result = new char[count];
        System.arraycopy(arr, 0, result, 0, count);
        return result;
    }

    public static int[] freqMap(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        return freq;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = input.nextLine();

        char[] unique = uniqueChars(s);
        int[] freq = freqMap(s);

        System.out.println("Character | Frequency");
        for (char ch : unique) {
            System.out.printf("    %s     |     %d\n", ch, freq[ch]);
        }
    }
}
