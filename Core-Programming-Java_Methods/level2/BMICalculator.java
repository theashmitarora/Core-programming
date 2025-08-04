import java.util.Scanner;

public class BMICalculator {
    public static double computeBMI(double w, double hCm) {
        double heightM = hCm / 100;
        return w / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        double[][] persons = new double[10][3]; // [weight, heightCm, BMI]
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
            persons[i][2] = computeBMI(persons[i][0], persons[i][1]);
        }

        System.out.println("\nWeight\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f\t%.1f\t\t%.2f\t%s\n",
                persons[i][0],
                persons[i][1],
                persons[i][2],
                getBMIStatus(persons[i][2]));
        }
    }
}
