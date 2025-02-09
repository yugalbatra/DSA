package Amazon.Day4;

public class MaximumProductSubarray {

    public int maxProductKadane(int[] nums) {
        int min = nums[0], max = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                max = min ^ max ^ (min = max);
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.max(nums[i], min * nums[i]);
            ans = Math.max(max, ans);
        }

        return ans;
    }

    public int maxProduct(int[] nums) {
        int curr = 1, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (curr == 0) {
                curr = nums[i];
            }
            else {
                curr *= nums[i];
            }
            max = Math.max(curr, max);
        }

        curr =1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (curr == 0) {
                curr = nums[i];
            }
            else {
                curr *= nums[i];
            }
            max = Math.max(curr, max);
        }

        return max;
    }
}
