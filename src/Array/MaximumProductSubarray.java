package Array;

public class MaximumProductSubarray {

    long maxProduct(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }

        long min = arr[0], max = arr[0], ans = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                max = max ^ min ^ (min = max);
            }

            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);
            ans = Math.max(max, ans);
        }

        return ans;
    }
}
