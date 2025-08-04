import java.util.Scanner;

public class UniqueCharacters {

    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count++);
            }
        } catch (Exception ignored) {}
        return count;
    }

    public static char[] uniqueChars(String text) {
        int len = getLength(text);
        char[] unique = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[index++] = ch;
        }

        char[] result = new char[index];
        System.arraycopy(unique, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();

        char[] result = uniqueChars(text);
        System.out.print("Unique characters: ");
        for (char ch : result) {
            System.out.print(ch + " ");
        }
    }
}
