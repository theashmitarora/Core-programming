import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int num : nums) {
            if (num > 0) {
                String parity = (num % 2 == 0) ? "even" : "odd";
                System.out.println(num + " is positive and " + parity);
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println("Number is zero.");
            }
        }

        if (nums[0] > nums[4]) {
            System.out.println("First element is greater than last.");
        } else if (nums[0] < nums[4]) {
            System.out.println("First element is less than last.");
        } else {
            System.out.println("First and last elements are equal.");
        }
    }
}
