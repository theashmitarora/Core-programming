import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt();

        System.out.println("Is the first number the largest? " + (n1 >= n2 && n1 >= n3));
        System.out.println("Is the second number the largest? " + (n2 >= n1 && n2 >= n3));
        System.out.println("Is the third number the largest? " + (n3 >= n1 && n3 >= n2));
    }
}
