package ActivityChapter4;
import java.util.Arrays;

public class Task8 {

    /**
     * Computes the cumulative sum for a list of integers.
     * @param numbers The integer variable arguments (varargs) list.
     * @return An array containing the cumulative sums up to each point.
     */

    public static int[] cumulativeSum(int... numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }
        int[] cumulativeSums = new int[numbers.length];     
        int runningTotal = 0;
        for (int i = 0; i < numbers.length; i++) {
            runningTotal += numbers[i];         
            cumulativeSums[i] = runningTotal;
        }
        return cumulativeSums;
    }

    public static void main(String[] args) {

        int[] result1 = cumulativeSum(4, 5, 10);
        System.out.println("Input: {4, 5, 10}");
        System.out.println("Cumulative Sums: " + Arrays.toString(result1));

        int[] result2 = cumulativeSum(1, 2, 3, 4, 6);
        System.out.println("\nInput: {1, 2, 3, 4, 5}");
        System.out.println("Cumulative Sums: " + Arrays.toString(result2));
        
        int[] result3 = cumulativeSum();
        System.out.println("\nInput: {}");
        System.out.println("Cumulative Sums: " + Arrays.toString(result3));
    }
}
