import java.util.Scanner;

public class NumberFormatDemo {

    public static void generate(String input) {
        int num = Integer.parseInt(input); // unsafe
        System.out.println("Value: " + num);
    }

    public static void handle(String input) {
        try {
            int num = Integer.parseInt(input);
            System.out.println("Value: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = in.next();
        // generate(input);
        handle(input);
    }
}
