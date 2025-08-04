import java.util.Scanner;

public class NumberChecker_5 {

    // Method to check if the number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if the number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if the number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int n = number;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    // Method to check if the number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if the number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Main method to call utility functions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        System.out.println("\n===== Number Analysis =====");
        System.out.println("Number: " + number);

        System.out.println("Is Prime Number?       " + (isPrime(number) ? "Yes" : "No"));
        System.out.println("Is Neon Number?        " + (isNeon(number) ? "Yes" : "No"));
        System.out.println("Is Spy Number?         " + (isSpy(number) ? "Yes" : "No"));
        System.out.println("Is Automorphic Number? " + (isAutomorphic(number) ? "Yes" : "No"));
        System.out.println("Is Buzz Number?        " + (isBuzz(number) ? "Yes" : "No"));
    }
}
