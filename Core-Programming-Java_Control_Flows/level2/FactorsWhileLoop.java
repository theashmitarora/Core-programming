import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Factors of " + number + ":");
            int i = 1;
            while (i <= number) {
                if (number % i == 0)
                    System.out.println(i);
                i++;
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
