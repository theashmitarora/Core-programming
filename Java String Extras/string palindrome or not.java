import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String s = sc.nextLine().toLowerCase();
        String reversed = "";
        for (int i=s.length()-1;i>=0;i--) {
            reversed += s.charAt(i);
        }
        if (s.equals(reversed)){
            System.out.println("palindrome");
        } 
        else{
            System.out.println("not a palindrome");
        }
    }
}
