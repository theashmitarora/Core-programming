import java.util.Scanner;

public class EvenOddPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is even");
                else
                    System.out.println(i + " is odd");
            }
        } else {
            System.out.println("Please enter a positive number");
        }
    }
}
