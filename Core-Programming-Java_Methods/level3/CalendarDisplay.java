import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the month name from month number
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        if (month < 1 || month > 12) return "Invalid Month";
        return months[month - 1];
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 
                             31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) return 29;
        if (month < 1 || month > 12) return 0;
        return daysInMonth[month - 1];
    }

    // Method to get the first day of month (0=Sunday, 1=Monday,...6=Saturday)
    // Using Gregorian Calendar algorithm as per hint
    // d=1 (first day of month)
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0)/12) % 7;
        return d0;
    }

    // Method to print the calendar for the given month and year
    public static void printCalendar(int month, int year) {
        System.out.println("\n  " + getMonthName(month) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int firstDay = getFirstDayOfMonth(month, year); // 0=Sunday
        int days = getDaysInMonth(month, year);

        // Print indentation for the day of the week the month starts on
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print all days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%2d ", day);
            // Move to next line after Saturday (day 6)
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println(); // newline at end
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year (e.g., 2025): ");
        int year = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month entered.");
            return;
        }

        if (year < 1) {
            System.out.println("Invalid year entered.");
            return;
        }

        printCalendar(month, year);
    }
}
