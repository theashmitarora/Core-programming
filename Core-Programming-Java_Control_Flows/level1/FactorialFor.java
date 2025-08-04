import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n >= 0) {
            int result = 1;
            for (int i = 1; i <= n; i++) result *= i;
            System.out.println("Factorial of " + n + " is " + result);
        } else {
            System.out.println("Not a positive integer.");
        }
    }
}
