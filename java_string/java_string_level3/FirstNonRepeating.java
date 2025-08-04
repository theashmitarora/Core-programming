import java.util.Scanner;
public class FirstNonRepeating {
    public static char findFirstUnique(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = in.nextLine();
        char result = findFirstUnique(text);

        if (result != '\0') System.out.println("First non-repeating character: " + result);
        else System.out.println("No unique characters.");
    }
}
