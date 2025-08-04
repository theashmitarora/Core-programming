import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt();

        boolean isSmallest = n1 <= n2 && n1 <= n3;
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
