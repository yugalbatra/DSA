package Amazon.Day3;

import java.util.*;

public class TripletSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                ans.addAll(twoSum(nums, i + 1, -nums[i]));
            }
        }

        return ans;
    }

    private List<List<Integer>> twoSum(int[] nums, int i, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] < target) {
                i++;
            }
            else if (nums[i] + nums[j] > target) {
                j--;
            }
            else {
                ans.add(List.of(nums[i], nums[j], -target));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new TripletSum().threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
    }
}
