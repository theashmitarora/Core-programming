import java.util.Scanner;

public class average {
    public static void main(String[] args){
        Scanner average = new Scanner(System.in);
        System.out.print("Please enter the first number = ");
        double num_1 = average.nextDouble();
        System.out.print("Please enter the second number = ");
        double num_2 = average.nextDouble();
        System.out.print("Please enter the third number = ");
        double num_3 = average.nextDouble();

        double average_3 = (num_1+num_2+num_3)/3;

        System.out.println("The average of the given three numbers = " + average_3);
    }
}
