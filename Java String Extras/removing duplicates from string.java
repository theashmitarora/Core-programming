import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String s = sc.nextLine();
        String result = "";
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println("string after duplicate remove: " + result);
    }
}
