package Neetcode.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            twoSum(nums, i + 1, nums.length - 1, -nums[i], ans);
        }

        return ans;
    }

    public void twoSum(int[] nums, int i, int j, int target, List<List<Integer>> ans) {
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                ans.add(List.of(-target, nums[i++], nums[j--]));
                while (i < j && nums[i] == nums[i - 1]) {
                    i++;
                }
                while (i < j && nums[j] == nums[j + 1]) {
                    j--;
                }
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }
    }
}
