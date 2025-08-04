import java.util.Scanner;

public class SumUntilBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (>0 to continue): ");
            double num = input.nextDouble();
            if (num <= 0) break;
            total += num;
        }
        System.out.println("Total sum: " + total);
    }
}
