import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side A (meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter Side B (meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter Side C (meters): ");
        double c = sc.nextDouble();

        double perimeter = a + b + c;
        int rounds = (int) Math.ceil(5000 / perimeter);

        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");
    }
}
