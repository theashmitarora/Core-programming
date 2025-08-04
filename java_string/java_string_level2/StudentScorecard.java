import java.util.Scanner;

public class StudentScorecard {

    public static int[][] getMarks(int n) {
        int[][] pcm = new int[n][3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Physics: ");
            pcm[i][0] = input.nextInt();
            System.out.print("Chemistry: ");
            pcm[i][1] = input.nextInt();
            System.out.print("Math: ");
            pcm[i][2] = input.nextInt();
        }
        return pcm;
    }

    public static double[][] getScoreSummary(int[][] pcm) {
        double[][] stats = new double[pcm.length][3]; // {total, average, percentage}
        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[] assignGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percent = stats[i][2];

            if (percent >= 85) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 50) grades[i] = "C";
            else if (percent >= 35) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScorecard(int[][] pcm, double[][] stats, String[] grades) {
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-10s %-8s\n", "Physics", "Chem", "Math", "Total", "Average", "Percent", "Grade");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < pcm.length; i++) {
            System.out.printf("%-8d %-8d %-8d %-8.0f %-8.2f %-10.2f %-8s\n", pcm[i][0], pcm[i][1], pcm[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[][] pcm = getMarks(n);
        double[][] stats = getScoreSummary(pcm);
        String[] grades = assignGrades(stats);
        displayScorecard(pcm, stats, grades);
    }
}
