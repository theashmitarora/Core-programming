import java.util.Scanner;

public class ArrayExceptionDemo {
    public static void generate(String[] names) {
        System.out.println(names[5]); // invalid index
    }

    public static void handle(String[] names) {
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] names = {"John", "Maria", "Ali"};
        // generate(names);
        handle(names);
    }
}
