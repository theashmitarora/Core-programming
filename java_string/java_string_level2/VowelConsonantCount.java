import java.util.Scanner;
public class VowelConsonantCount {

    public static String getCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32); // convert to lowercase

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0)
                return "Vowel";
            else
                return "Consonant";
        }
        return "NotLetter";
    }

    public static int[] countVowelConsonants(String text) {
        int vowel = 0, consonant = 0;
        int len = new StringLength().customLength(text);
        for (int i = 0; i < len; i++) {
            String type = getCharType(text.charAt(i));
            if (type.equals("Vowel")) vowel++;
            else if (type.equals("Consonant")) consonant++;
        }
        return new int[]{vowel, consonant};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = in.nextLine();
        int[] result = countVowelConsonants(text);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
