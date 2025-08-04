import java.util.Scanner;

public class NumberChecker {

    // Method to count the number of digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to extract digits into an array
    public static int[] getDigitsArray(int number) {
        String numStr = Integer.toString(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to check if a number is a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        // Consider 0s in non-leading positions
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Largest and second largest digits
    public static int[] findTwoLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Smallest and second smallest digits
    public static int[] findTwoSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method to test all utilities
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("\nDigit Count: " + digitCount);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        if (isDuckNumber(digits))
            System.out.println("Result: This is a Duck Number.");
        else
            System.out.println("Result: This is NOT a Duck Number.");

        if (isArmstrongNumber(number, digits))
            System.out.println("Result: This is an Armstrong Number.");
        else
            System.out.println("Result: This is NOT an Armstrong Number.");

        int[] largest = findTwoLargest(digits);
        int[] smallest = findTwoSmallest(digits);

        System.out.println("Largest Digit: " + largest[0]);
        System.out.println("Second Largest Digit: " + (largest[1] != Integer.MIN_VALUE ? largest[1] : "None"));

        System.out.println("Smallest Digit: " + smallest[0]);
        System.out.println("Second Smallest Digit: " + (smallest[1] != Integer.MAX_VALUE ? smallest[1] : "None"));
    }
}
