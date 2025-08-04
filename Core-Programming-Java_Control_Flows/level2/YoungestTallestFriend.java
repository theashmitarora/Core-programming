import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = input.nextInt();

        // Heights
        System.out.print("Enter Amar's height: ");
        int heightAmar = input.nextInt();
        System.out.print("Enter Akbar's height: ");
        int heightAkbar = input.nextInt();
        System.out.print("Enter Anthony's height: ");
        int heightAnthony = input.nextInt();

        // Youngest
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony)
            System.out.println("Amar is the youngest.");
        else if (ageAkbar <= ageAnthony)
            System.out.println("Akbar is the youngest.");
        else
            System.out.println("Anthony is the youngest.");

        // Tallest
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony)
            System.out.println("Amar is the tallest.");
        else if (heightAkbar >= heightAnthony)
            System.out.println("Akbar is the tallest.");
        else
            System.out.println("Anthony is the tallest.");
    }
}
