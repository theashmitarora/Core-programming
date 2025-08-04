import java.util.Scanner;

public class SumNaturalCheckFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) sum += i;

            int formulaResult = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formulaResult);
            System.out.println("Results match: " + (sum == formulaResult));
        } else {
            System.out.println("Not a natural number.");
        }
    }
}
