package Leetcode;

public class FindIfArrayCanBeSorted {

    public boolean canSortArray(int[] nums) {
        int maxTillNow = 0, lastBits = -1, currMax = 0;
        for (int i = 0; i < nums.length; i++) {
            int countBits = Integer.bitCount(nums[i]);
            if (lastBits != -1 && countBits != lastBits) {
                maxTillNow = Math.max(maxTillNow, currMax);
                currMax = 0;
            }

            currMax = Math.max(currMax, nums[i]);
            lastBits = countBits;

            if (nums[i] < maxTillNow) {
                return false;
            }
        }

        return true;
    }
}
