import java.util.Scanner;
import java.util.Arrays;

public class DigitAnalysisTool {

    // Method 1: Count number of digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method 2: Store digits in an array
    public static int[] getDigitsArray(int number) {
        String numStr = Integer.toString(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method 3: Reverse the digits array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method 4: Compare two arrays for equality
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method 5: Check if number is Palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method 6: Check if number is Duck number
    public static boolean isDuckNumber(int[] digits) {
        // Duck number: has zero in non-leading digit place
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Main method to test all utilities
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);

        // Display data
        System.out.println("\nOriginal Digits:");
        for (int d : digits) System.out.print(d + " ");
        System.out.println("\nReversed Digits:");
        for (int d : reversed) System.out.print(d + " ");
        System.out.println();

        // Operations
        System.out.println("\nTotal number of digits: " + count);
        System.out.println("Is Palindrome? " + (isPalindrome(digits) ? "Yes" : "No"));
        System.out.println("Is Duck Number? " + (isDuckNumber(digits) ? "Yes" : "No"));
    }
}
