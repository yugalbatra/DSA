package Neetcode.ArraysAndHashing;

import java.util.*;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(set::add);

        int max = 1;
        for (int num : nums) {
            int count = 1;
            int temp = num;
            while (set.contains(--temp)) {
                count++;
                set.remove(temp);
            }

            temp = num;
            while (set.contains(++temp)) {
                count++;
                set.remove(temp);
            }

            max = Math.max(count, max);
        }

        return max;
    }
}
