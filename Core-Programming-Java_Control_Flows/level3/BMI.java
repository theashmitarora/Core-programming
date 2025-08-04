import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter height (cm): ");
        double heightCM = input.nextDouble();

        double heightM = heightCM / 100;
        double bmi = weight / (heightM * heightM);

        System.out.printf("Your BMI is %.2f%n", bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 24.9)
            System.out.println("Normal weight");
        else if (bmi < 29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
