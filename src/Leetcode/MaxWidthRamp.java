package Leetcode;

public class MaxWidthRamp {

    int maxRamp = 0;

    public int maxWidthRamp(int[] nums) {
        maxWidthRamp(nums, 0, nums.length - 1);
        return maxRamp;
    }

    public void maxWidthRamp(int[] nums, int i, int j) {
        if (i == j || maxRamp >= j - i) {
            return;
        }

        if (nums[i] <= nums[j]) {
            maxRamp = Math.max(j - i, maxRamp);
        }

        maxWidthRamp(nums, i + 1, j);
        maxWidthRamp(nums, i, j - 1);
    }
}
