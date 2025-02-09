package Leetcode;

public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        int max = 0, last = Integer.MIN_VALUE, count = 0;
        for (int i : nums) {
            if (i > last) {
                count++;
            }
            else {
                count = 1;
            }
            max = Math.max(max, count);
            last = i;
        }

        return max;
    }
}
