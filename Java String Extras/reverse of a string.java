import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String s = sc.nextLine();
        String reversed = "";
        for (int i = s.length()-1;i>=0;i--){
            reversed += s.charAt(i);
        }
        System.out.println("reversed: " + reversed);
    }
}
