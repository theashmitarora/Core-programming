import java.util.Scanner;

public class CollinearityChecker {

    // Method to check collinearity using the slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Avoid division by zero: If x2==x1 or x3==x2, handle separately
        double slopeAB = (x2 - x1) == 0 ? Double.POSITIVE_INFINITY : (y2 - y1) / (x2 - x1);
        double slopeBC = (x3 - x2) == 0 ? Double.POSITIVE_INFINITY : (y3 - y2) / (x3 - x2);

        // Compare slopes (handles vertical line case)
        return Double.compare(slopeAB, slopeBC) == 0;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) +
                             x2 * (y3 - y1) +
                             x3 * (y1 - y2));
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // You can take input or use the sample values as below:
        System.out.println("Check if three points are collinear (using slope and area):");
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.hasNextDouble() ? sc.nextDouble() : 2;
        double y1 = sc.hasNextDouble() ? sc.nextDouble() : 4;

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.hasNextDouble() ? sc.nextDouble() : 4;
        double y2 = sc.hasNextDouble() ? sc.nextDouble() : 6;

        System.out.print("Enter x3 and y3: ");
        double x3 = sc.hasNextDouble() ? sc.nextDouble() : 6;
        double y3 = sc.hasNextDouble() ? sc.nextDouble() : 8;

        // Slope check
        boolean collinearSlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Area check
        boolean collinearArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\n--- Results ---");
        System.out.println("By Slope Formula: " + (collinearSlope ? "Collinear" : "Not Collinear"));
        System.out.println("By Area Formula: " + (collinearArea ? "Collinear" : "Not Collinear"));

        // Sample demonstration for A(2,4), B(4,6), C(6,8)
        if (x1 == 2 && y1 == 4 && x2 == 4 && y2 == 6 && x3 == 6 && y3 == 8) {
            System.out.println("\nSample Points: A(2,4), B(4,6), C(6,8)");
            System.out.println("Collinear by both methods: " +
                    (collinearSlope && collinearArea ? "Yes" : "No"));
        }
    }
}
