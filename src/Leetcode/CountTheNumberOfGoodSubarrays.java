package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfGoodSubarrays {

    public long countGood(int[] nums, int k) {
        long count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        while (i < nums.length && j < nums.length) {
            if (isGood(map, k)) {
                count += nums.length - j + 1;
                map.merge(nums[i++], 1, (a, b) -> a - b);
            }
            else {
                map.merge(nums[j++], 1, Integer::sum);
            }
        }

        while (i < nums.length) {
            if (isGood(map, k)) {
                count += nums.length - j + 1;
                map.merge(nums[i++], 1, (a, b) -> a - b);
            }
            else {
                break;
            }
        }

        return count;
    }

    private boolean isGood(Map<Integer, Integer> map, int k) {
        return map.values().stream().mapToInt(i -> (i * (i - 1)) / 2).sum() >= k;
    }

    public static void main(String[] args) {
        System.out.println(new CountTheNumberOfGoodSubarrays().countGood(new int[] { 3, 1, 4, 3, 2, 2, 4 }, 2));
    }
}
