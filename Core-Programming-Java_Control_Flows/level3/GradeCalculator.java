import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = input.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Enter marks in Math: ");
        int math = input.nextInt();

        double avg = (physics + chemistry + math) / 3.0;
        System.out.println("Average Marks: " + avg);

        String grade, remarks;

        if (avg >= 85) {
            grade = "A";
            remarks = "Excellent";
        } else if (avg >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (avg >= 50) {
            grade = "C";
            remarks = "Fair";
        } else if (avg >= 35) {
            grade = "D";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("Grade: " + grade + " - " + remarks);
    }
}
