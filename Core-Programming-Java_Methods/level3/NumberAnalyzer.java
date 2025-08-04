import java.util.Scanner;

public class NumberAnalyzer {

    // Method to count the number of digits
    public static int countDigits(int number) {
        return Integer.toString(Math.abs(number)).length();
    }

    // Method to extract digits into an array
    public static int[] getDigitsArray(int number) {
        String numStr = Integer.toString(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; // convert char to int
        }
        return digits;
    }

    // Method to calculate the sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to calculate sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2); // Using Math.pow as per hint
        }
        return sum;
    }

    // Method to check if number is Harshad (divisible by sum of digits)
    public static boolean isHarshadNumber(int number, int digitSum) {
        return number % digitSum == 0;
    }

    // Method to get frequency of digits as a 2D array
    public static int[][] getDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // 10 rows (digits 0 to 9)
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // digit
            freq[i][1] = 0; // frequency
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    // Main method to run and test all utilities
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        // Perform operations
        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);

        int digitSum = sumOfDigits(digits);
        int digitSumSquares = sumOfSquares(digits);
        boolean isHarshad = isHarshadNumber(number, digitSum);
        int[][] frequencyTable = getDigitFrequency(digits);

        // Display results
        System.out.println("\nDigits in number:");
        for (int d : digits) System.out.print(d + " ");
        System.out.println("\n");

        System.out.println("Total number of digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
        System.out.println("Sum of squares of digits: " + digitSumSquares);
        System.out.println("Is Harshad Number? " + (isHarshad ? "Yes" : "No"));

        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequencyTable[i][1] > 0) {
                System.out.println("Digit " + frequencyTable[i][0] + " appears " + frequencyTable[i][1] + " time(s)");
            }
        }
    }
}
