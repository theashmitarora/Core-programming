import java.util.Random;
import java.util.Arrays;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + rand.nextInt(9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;
        for (int x : arr) {
            sum += x;
            if (x < min) min = x;
            if (x > max) max = x;
        }
        return new double[]{sum / 5.0, min, max};
    }

    public static void main(String[] args) {
        int[] randoms = generate4DigitRandomArray(5);
        System.out.println("Random Numbers: " + Arrays.toString(randoms));
        double[] stats = findAverageMinMax(randoms);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f\n", stats[0], stats[1], stats[2]);
    }
}
