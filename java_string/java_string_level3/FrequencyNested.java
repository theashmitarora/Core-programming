import java.util.Scanner;

public class FrequencyNested {
    public static void getFrequency(String s) {
        char[] ch = s.toCharArray();
        int[] freq = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }

        System.out.println("Character | Frequency");
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                System.out.printf("    %s     |     %d\n", ch[i], freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = in.nextLine();
        getFrequency(s);
    }
}
