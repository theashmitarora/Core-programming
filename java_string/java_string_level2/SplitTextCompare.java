import java.util.Scanner;

public class SplitTextCompare {

    public static int strLength(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception ignored) {}
        return len;
    }

    public static String[] customSplit(String text) {
        int len = strLength(text);
        int wordCount = 1; // assume at least one word

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[wordIndex++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = in.nextLine();

        String[] builtIn = input.split(" ");
        String[] custom = customSplit(input);

        System.out.println("Arrays match: " + compareArrays(custom, builtIn));
    }
}
