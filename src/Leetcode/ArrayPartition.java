package Leetcode;

import java.util.Arrays;

public class ArrayPartition {

    public int arrayPairSumOptimized(int[] nums) {
        int[] arr = new int[20001];
        for (int i : nums) {
            arr[i + 10000]++;
        }

        boolean pick = true;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                if (pick) {
                    sum += i - 10000;
                }

                pick = !pick;
                arr[i]--;
            }
        }

        return sum;
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}
