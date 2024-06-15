package Array;

public class MaxSubarraySum {

    public static long maxSubarraySum(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        for (int i : arr) {
            currentSum = Math.max(currentSum + i, i);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
