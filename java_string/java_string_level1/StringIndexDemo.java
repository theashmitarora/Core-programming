import java.util.Scanner;

public class StringIndexDemo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // invalid index
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.next();
        // generateException(text) 2210992027; // unsafe
        handleException(text); // safe
    }
}
