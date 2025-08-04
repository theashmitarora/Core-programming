import java.util.Scanner;
public class FrequencyUsingCharAt {

    public static String[][] getFrequency(String text) {
        int[] freq = new int[256];
        int len = text.length();

        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        boolean[] visited = new boolean[256];
        String[][] result = new String[len][2];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (!visited[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                visited[ch] = true;
                index++;
            }
        }

        String[][] finalResult = new String[index][2];
        System.arraycopy(result, 0, finalResult, 0, index);
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = in.nextLine();

        String[][] freq = getFrequency(text);
        System.out.println("Character | Frequency");
        for (String[] row : freq) {
            System.out.printf("    %s     |     %s\n", row[0], row[1]);
        }
    }
}
