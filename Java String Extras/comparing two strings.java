import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first string: ");
        String s1 = sc.nextLine();
        System.out.print("second string: ");
        String s2 = sc.nextLine();
        if (s1.equals(s2)){
            System.out.println("equal");
        } 
        else {
            System.out.println("not equal");
        }
    }
}
