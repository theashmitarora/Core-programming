import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d - Physics Marks: ", i + 1);
            physics[i] = sc.nextInt();
            System.out.printf("Student %d - Chemistry Marks: ", i + 1);
            chemistry[i] = sc.nextInt();
            System.out.printf("Student %d - Maths Marks: ", i + 1);
            maths[i] = sc.nextInt();

            percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 80) grade[i] = "B";
            else if (percent[i] >= 70) grade[i] = "C";
            else grade[i] = "D";
        }

        System.out.println("Marks\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\t%.2f\t\t%s\n", physics[i], chemistry[i], maths[i], percent[i], grade[i]);
        }
    }
}
