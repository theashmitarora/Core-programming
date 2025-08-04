import java.util.Scanner;

public class SumNaturalCheckWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaResult = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaResult);
            System.out.println("Results match: " + (sum == formulaResult));
        } else {
            System.out.println("Not a natural number.");
        }
    }
}
