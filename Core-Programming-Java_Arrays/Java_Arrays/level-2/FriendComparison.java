// package level-2;

import java.util.Scanner;

public class FriendComparison {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter age of %s: ", names[i]);
            ages[i] = sc.nextInt();
            System.out.printf("Enter height of %s (in cm): ", names[i]);
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0, tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }

        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);
    }
}

