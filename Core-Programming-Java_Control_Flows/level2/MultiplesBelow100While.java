import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = input.nextInt();

        if (number > 0 && number < 100) {
            int counter = 1;
            System.out.println("Multiples of " + number + " below 100:");
            while (counter < 100) {
                if (counter % number == 0)
                    System.out.println(counter);
                counter++;
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
