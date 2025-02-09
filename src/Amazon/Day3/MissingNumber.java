package Amazon.Day3;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]++;
        }
        boolean n = true;
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) == nums.length + 1) {
                n = false;
            }
            else {
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }

        if (n) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i;
            }
        }

        return -1;
    }
}
