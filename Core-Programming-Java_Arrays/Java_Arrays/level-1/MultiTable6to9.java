import java.util.Scanner;

public class MultiTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[][] multiplicationResults = new int[4][10];

        for (int i = 6; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                multiplicationResults[i - 6][j - 1] = i * j;
            }
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println("Multiplication Table of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + multiplicationResults[i - 6][j - 1]);
            }
            System.out.println();
        }
    }
}
