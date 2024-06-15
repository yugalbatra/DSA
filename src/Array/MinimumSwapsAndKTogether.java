package Array;

public class MinimumSwapsAndKTogether {

    public static int minSwap(int[] arr, int n, int k) {
        int count = 0;
        for (int i : arr) {
            if (i <= k) {
                count++;
            }
        }

        int max = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] <= k) {
                max++;
            }
        }

        int cuurMax = max;
        for (int i = count; i < n; i++) {
            if (arr[i] <= k) {
                cuurMax++;
            }
            if (arr[i - count] <= k) {
                cuurMax--;
            }
            max = Math.max(max, cuurMax);
        }

        return count - max;
    }
}
