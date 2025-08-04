import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year (>=1582): ");
        int year = input.nextInt();

        if (year >= 1582) {
            if (year % 4 != 0) {
                System.out.println(year + " is Not a Leap Year");
            } else if (year % 100 != 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is Not a Leap Year");
            }
        } else {
            System.out.println("Leap year checking applies only for year >= 1582");
        }
    }
}
