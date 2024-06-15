package Array;

import java.util.Arrays;

public class NextPermutations {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int i = nums.length - 1;
        for (; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                break;
            }
        }

        if (i == 0) {
            for (int j = 0; j < nums.length / 2; j++) {
                int temp = nums[j];
                nums[j] = nums[nums.length - j - 1];
                nums[nums.length - j - 1] = temp;
            }
            return;
        }

        int minIndex = i;
        for (int j = i; j < nums.length; j++) {
            if (nums[j] > nums[i - 1] && nums[j] < nums[minIndex]) {
                minIndex = j;
            }
        }

        nums[minIndex] = nums[minIndex] ^ nums[i - 1] ^ (nums[i - 1] = nums[minIndex]);
        Arrays.sort(nums, i, nums.length);
    }
}
