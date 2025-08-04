import java.util.Scanner;

public class VotingEligibility {

    public static int[] collectAges(int n) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }
        return ages;
    }

    public static String[][] getVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    public static void printTable(String[][] data) {
        System.out.printf("%-10s | %s\n", "Age", "Eligibility");
        System.out.println("------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s | %s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = collectAges(10);
        String[][] results = getVotingEligibility(ages);
        printTable(results);
    }
}
