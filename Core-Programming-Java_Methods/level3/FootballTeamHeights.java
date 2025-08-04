import java.util.Scanner;

public class FootballTeamHeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[11];

        System.out.println("Enter the heights (in cm) of 11 football players (between 150 and 250 cm):");

        int i = 0;
        while (i < 11) {
            System.out.print("Player " + (i + 1) + " height: ");
            int height = sc.nextInt();
            
            if (height >= 150 && height <= 250) {
                heights[i] = height;
                i++;
            } else {
                System.out.println("Invalid height. Please enter a value between 150 and 250 cm.");
            }
        }

        int sum = sumHeights(heights);
        double mean = meanHeight(heights);
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);

        System.out.println("\nSUMMARY:");
        System.out.println("All heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\n\nShortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.printf("Mean height: %.2f cm\n", mean);
    }

    // Method to find the sum of array elements
    public static int sumHeights(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }

    // Method to find the mean height
    public static double meanHeight(int[] arr) {
        return (double) sumHeights(arr) / arr.length;
    }

    // Method to find the shortest height
    public static int shortestHeight(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) min = h;
        }
        return min;
    }

    // Method to find the tallest height
    public static int tallestHeight(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) max = h;
        }
        return max;
    }
}
