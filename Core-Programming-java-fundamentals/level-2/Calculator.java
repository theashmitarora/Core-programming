import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        float number1 = sc.nextFloat();
        System.out.print("Enter number2: ");
        float number2 = sc.nextFloat();

        float sum = number1 + number2;
        float diff = number1 - number2;
        float mul = number1 * number2;
        float div = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + sum + ", " + diff + ", " + mul + ", and " + div);
    }
}
