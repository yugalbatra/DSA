package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            index = Math.abs(nums[i]) - 1;
            nums[index] = Math.abs(nums[index]) * -1;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }

        return list;
    }
}
