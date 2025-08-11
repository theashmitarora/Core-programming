import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String s = sc.nextLine();
        System.out.print("character to remove: ");
        char remove = sc.next().charAt(0);
        String result = "";
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch != remove) {
                result += ch;
            }
        }
        System.out.println("string after removing :" + result);
    }
}
