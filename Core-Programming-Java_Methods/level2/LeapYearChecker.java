import java.util.Scanner;

public class LeapYearChecker {
    public static boolean isLeap(int year) {
        return year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) System.out.println("Year must be ≥ 1582");
        else System.out.println(isLeap(year) ? "It's a Leap Year" : "Not a Leap Year");
    }
}
