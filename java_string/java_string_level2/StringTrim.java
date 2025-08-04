import java.util.Scanner;
public class StringTrim {

    public static int[] getTrimIndices(String str) {
        int len = StringLength.customLength(str);
        int start = 0;
        while (start < len && str.charAt(start) == ' ') start++;

        int end = len - 1;
        while (end >= 0 && str.charAt(end) == ' ') end--;

        return new int[]{start, end + 1}; // exclusive end index
    }

    public static String substringCustom(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compare(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text with extra spaces: ");
        String input = in.nextLine();

        int[] indices = getTrimIndices(input);
        String manualTrim = substringCustom(input, indices[0], indices[1]);
        String builtInTrim = input.trim();

        System.out.println("Manual Trim: [" + manualTrim + "]");
        System.out.println("Built-in Trim: [" + builtInTrim + "]");
        System.out.println("Match: " + compare(manualTrim, builtInTrim));
    }
}
