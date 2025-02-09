package Amazon.Day1;

import java.util.*;

public class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicatesExtraSpace(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (final int num : nums) {
            if (set.contains(num)) {
                ans.add(num);
            }

            set.add(num);
        }

        return ans;
    }

    public List<Integer> findDuplicatesConstantSpace1(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for (final int num : nums) {
            nums[(num-1) % n] += n;
        }

        for (int i = 0; i < n; i++) {
            if ((nums[i] - 1) / n >= 2) {
                ans.add(i+1);
            }
        }

        return ans;
    }

    public List<Integer> findDuplicatesConstantSpace2(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0) {
                ans.add(index+1);
            }

            nums[index] *= -1;
        }

        return ans;
    }
}
