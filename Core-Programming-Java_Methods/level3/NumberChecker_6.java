import java.util.Scanner;

public class NumberChecker_6 {

    // Method 1: Get all factors of a number
    public static int[] getFactors(int number) {
        int count = 0;

        // First loop to count factors (for array size)
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }

        // Second loop to store factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                factors[index++] = i;
        }
        return factors;
    }

    // Method 2: Get greatest factor (last in sorted factor list)
    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method 3: Get sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method 4: Get product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Method 5: Get product of cubes of factors
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Method 6: Check if perfect number (sum of proper divisors == number)
    public static boolean isPerfect(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) sum += f;
        }
        return sum == number;
    }

    // Method 7: Check if abundant number (sum of proper divisors > number)
    public static boolean isAbundant(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) sum += f;
        }
        return sum > number;
    }

    // Method 8: Check if deficient number (sum of proper divisors < number)
    public static boolean isDeficient(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) sum += f;
        }
        return sum < number;
    }

    // Method 9: Check if strong number
    // A number is strong if the sum of factorials of its digits equals the number itself
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    // Helper method for factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    // ===== Main method for testing =====
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int[] factors = getFactors(number);

        System.out.println("\nFactors of " + number + ":");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest factor: " + getGreatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.printf("Product of cubes of factors: %.0f\n", productOfCubes(factors));

        System.out.println("\nPerfect Number?   => " + (isPerfect(number, factors) ? "Yes" : "No"));
        System.out.println("Abundant Number?  => " + (isAbundant(number, factors) ? "Yes" : "No"));
        System.out.println("Deficient Number? => " + (isDeficient(number, factors) ? "Yes" : "No"));
        System.out.println("Strong Number?    => " + (isStrongNumber(number) ? "Yes" : "No"));
    }
}
