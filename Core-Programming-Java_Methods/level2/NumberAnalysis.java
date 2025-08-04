import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int x) { return x >= 0; }
    public static boolean isEven(int x) { return x % 2 == 0; }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                System.out.print("Positive and ");
                System.out.println(isEven(numbers[i]) ? "Even" : "Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        System.out.print("First vs Last: ");
        if (result == 1) System.out.println("First > Last");
        else if (result == 0) System.out.println("Equal");
        else System.out.println("First < Last");
    }
}
