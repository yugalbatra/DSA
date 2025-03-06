package Leetcode;

public class MaximumAbsoluteSumOfAnySubarray {

    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0;
        int currSUm = 0;
        for (int num : nums) {
            currSUm = Math.max(num, currSUm + num);
            maxSum = Math.max(maxSum, currSUm);
        }

        int minSum = 0;
        currSUm = 0;
        for (int num : nums) {
            currSUm = Math.min(num, currSUm + num);
            minSum = Math.min(minSum, currSUm);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}
