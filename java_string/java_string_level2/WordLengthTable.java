import java.util.Scanner;
public class WordLengthTable {

    public static int customLength(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len++);
            }
        } catch (Exception ignored) {}
        return len;
    }

    public static String[][] wordLength2D(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }

    public static void display(String[][] table) {
        System.out.printf("%-15s | %s%n", "Word", "Length");
        System.out.println("------------------------");
        for (String[] row : table) {
            System.out.printf("%-15s | %s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = in.nextLine();
        String[] words = SplitTextCompare.customSplit(text);
        String[][] table = wordLength2D(words);
        display(table);
    }
}
