import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generate() {
        String text = "Hello";
        System.out.println(text.substring(4, 2)); // illegal
    }

    public static void handle() {
        try {
            String text = "Hello";
            System.out.println(text.substring(4, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Any other exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // generate();
        handle();
    }
}
