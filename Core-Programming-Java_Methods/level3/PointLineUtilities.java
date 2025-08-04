import java.util.Scanner;

public class PointLineUtilities {

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    // Method to calculate slope and intercept and return as array [m, b]
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            throw new ArithmeticException("Slope is undefined (vertical line).");
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Distance calculation
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("\nEuclidean Distance between the two points: %.4f\n", distance);

        // Line equation calculation
        try {
            double[] equation = getLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of the line: y = %.4fx + %.4f\n", equation[0], equation[1]);
        } catch (ArithmeticException ex) {
            System.out.println("Cannot compute line equation: " + ex.getMessage());
        }
    }
}
