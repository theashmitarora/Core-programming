import java.util.Scanner;

public class CalendarMonth {

    static String getMonthName(int m) {
        String[] names = {"January", "February", "March", "April", "May", "June",
                          "July", "August", "September", "October", "November", "December"};
        return names[m - 1];
    }

    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }

    static int daysInMonth(int m, int y) {
        int[] days = {31, 28, 31, 30, 31, 30, 31,
                      31, 30, 31, 30, 31};
        if (m == 2 && isLeap(y)) return 29;
        return days[m - 1];
    }

    static int firstDay(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = in.nextInt();
        System.out.print("Enter year: ");
        int y = in.nextInt();

        int days = daysInMonth(m, y);
        int start = firstDay(1, m, y);

        System.out.println("\n" + getMonthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < start; i++) System.out.print("    ");

        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if ((i + start) % 7 == 0) System.out.println();
        }
    }
}
