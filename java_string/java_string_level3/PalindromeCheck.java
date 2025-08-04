import java.util.Scanner;

public class PalindromeCheck {
    static boolean method1(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean method2(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return method2(s, start + 1, end - 1);
    }

    static boolean method3(String s) {
        char[] original = s.toCharArray();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);
        char[] reversed = rev.toCharArray();
        for (int i = 0; i < original.length; i++)
            if (original[i] != reversed[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = in.nextLine();

        System.out.println("Method 1: " + method1(s));
        System.out.println("Method 2 (Recursive): " + method2(s, 0, s.length() - 1));
        System.out.println("Method 3 (Reverse Compare): " + method3(s));
    }
}
