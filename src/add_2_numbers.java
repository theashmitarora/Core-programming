import java.util.Scanner;

public class add_2_numbers {
    public static void main(String[] args){
        Scanner addition = new Scanner(System.in);
        System.out.print("Please enter your first number = ");
        float num_1 = addition.nextFloat();
        System.out.print("Please enter your second number =");
        float num_2 = addition.nextFloat();
        float sum = num_1+num_2;
        System.out.println("The sum of the provided two numbers = " + sum);
    }
}
