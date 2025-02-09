package Leetcode;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (int i : nums) {
            if (i == 1) {
                count++;
            }
            else {
                count = 0;
            }
            max = Math.max(count, max);
        }

        return max;
    }
}
