import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("sentence: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String longest = words[0];
        for (int i=1;i<words.length;i++){
            if (words[i].length()>longest.length()) {
                longest = words[i];
            }
        }
        System.out.println("longest word: " + longest);
    }
}
