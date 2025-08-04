import java.util.Scanner;
public class VowelConsonantDetail {

    public static String[][] classifyCharacters(String text) {
        int len = StringLength.customLength(text);
        String[][] details = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            details[i][0] = String.valueOf(ch);
            details[i][1] = VowelConsonantCount.getCharType(ch);
        }
        return details;
    }

    public static void display(String[][] data) {
        System.out.printf("%-10s | %s%n", "Character", "Type");
        System.out.println("------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s | %s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = in.nextLine();

        String[][] results = classifyCharacters(text);
        display(results);
    }
}
