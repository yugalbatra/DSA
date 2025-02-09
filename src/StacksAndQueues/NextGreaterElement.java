package StacksAndQueues;

import java.util.Arrays;

public class NextGreaterElement {

    public static long[] nextLargerElement(long[] arr, int n) {
        long[] ans = new long[n];
        Arrays.fill(ans, -1);
        int j;
        for (int i = n - 1; i >= 0; i--) {
            j = i - 1;
            while (j >= 0 && arr[j] < arr[i]) {
                ans[j--] = arr[i];
            }
        }

        return ans;
    }
}
