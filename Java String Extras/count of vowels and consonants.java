import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String t= sc.nextLine().toLowerCase();
        int vowel = 0;
        int consonant = 0;
        for (int i=0;i<t.length();i++) {
            char ch = t.charAt(i);
            if (ch>='a' && ch<='z'){
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    vowel++;
                } 
                else{
                    consonant++;
                }
            }
        }
        System.out.println("vowels: " + vowel);
        System.out.println("consonants: " + consonant);
    }
}

