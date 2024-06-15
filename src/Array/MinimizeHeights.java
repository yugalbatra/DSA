package Array;

import java.util.Arrays;

public class MinimizeHeights {

    private static double average(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }

    public static int getMinDiff(int[] arr, int n, int k) {
        double average = average(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] < average) {
                arr[i] += k;
            }
            else {
                arr[i] -= k;
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        return max - min;
    }
}
