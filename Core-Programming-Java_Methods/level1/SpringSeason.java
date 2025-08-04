import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
               (month == 4 || month == 5) ||
               (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month (1–12): ");
        int month = sc.nextInt();
        System.out.print("Enter Day: ");
        int day = sc.nextInt();

        boolean spring = isSpringSeason(month, day);
        System.out.println(spring ? "It is a Spring Season" : "Not a Spring Season");
    }
}
