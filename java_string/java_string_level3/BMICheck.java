import java.util.Scanner;

public class BMICheck {
    public static double[][] getHeightWeightData(int count) {
        Scanner input = new Scanner(System.in);
        double[][] hw = new double[count][2]; // [][0] = weight, [][1] = height
        for (int i = 0; i < count; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            hw[i][0] = input.nextDouble();
            System.out.print("Enter height (cm): ");
            hw[i][1] = input.nextDouble();
        }
        return hw;
    }

    public static String[] getStatus(double bmi) {
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";
        return new String[]{String.format("%.2f", bmi), status};
    }

    public static String[][] getBMIReport(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double height = hw[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (height * height);
            String[] bmiData = getStatus(bmi);

            result[i][0] = String.valueOf(hw[i][1]); // Height
            result[i][1] = String.valueOf(hw[i][0]); // Weight
            result[i][2] = bmiData[0];               // BMI
            result[i][3] = bmiData[1];               // Status
        }
        return result;
    }

    public static void printBMITable(String[][] table) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------");
        for (String[] row : table) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        double[][] data = getHeightWeightData(10);
        String[][] report = getBMIReport(data);
        printBMITable(report);
    }
}
