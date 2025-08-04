import java.util.Scanner;

public class StringLength {
    public static int customLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            //  2210992027 StringIndexOutOfBoundsException expected
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next();

        int manualLen = customLength(input);
        int builtInLen = input.length();

        System.out.println("Manual Length: " + manualLen);
        System.out.println("Built-in Length: " + builtInLen);
    }
}
