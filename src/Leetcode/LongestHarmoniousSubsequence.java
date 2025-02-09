package Leetcode;

public class LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        int max = 0;
        for (int i : nums) {
            max = Math.max(max, count(i, nums));
        }

        return max;
    }

    private int count(int i, int[] nums) {
        int count = 0;
        boolean plusOne = false;
        for (int num : nums) {
            if (num == i || num == i + 1) {
                count++;
            }
            if (num == i + 1) {
                plusOne = true;
            }
        }

        return plusOne ? count : 0;
    }
}
