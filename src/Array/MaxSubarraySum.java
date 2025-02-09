package Array;

public class MaxSubarraySum {

    public static long maxSubarraySum(int[] arr, int n) {
        long maxSum = Integer.MIN_VALUE, currentSum = 0;
        for (int i : arr) {
            currentSum = Math.max(currentSum + i, i);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    int maxSubarraySum(int[] arr) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for (final int i : arr) {
            currentSum = Math.max(currentSum + i, i);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
