import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // 0=Physics, 1=Chemistry, 2=Maths
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Physics, Chemistry & Maths marks for Student %d: ", i + 1);
            for (int j = 0; j < 3; j++) marks[i][j] = sc.nextInt();
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 80) grade[i] = "B";
            else if (percent[i] >= 70) grade[i] = "C";
            else grade[i] = "D";
        }

        System.out.println("Marks\t\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\t%.2f\t\t%s\n", marks[i][0], marks[i][1], marks[i][2], percent[i], grade[i]);
        }
    }
}
