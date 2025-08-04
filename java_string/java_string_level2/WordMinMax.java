import java.util.Scanner;
public class WordMinMax {

    public static int[] findMinMax(String[][] wordLengthTable) {
        int minLen = Integer.MAX_VALUE;
        int maxLen = Integer.MIN_VALUE;
        int minIndex = -1, maxIndex = -1;

        for (int i = 0; i < wordLengthTable.length; i++) {
            int len = Integer.parseInt(wordLengthTable[i][1]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }
        return new int[] {minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = in.nextLine();

        String[] words = SplitTextCompare.customSplit(text);
        String[][] table = WordLengthTable.wordLength2D(words);
        WordLengthTable.display(table);

        int[] result = findMinMax(table);
        System.out.println("\nShortest Word: " + table[result[0]][0]);
        System.out.println("Longest Word: " + table[result[1]][0]);
    }
}
