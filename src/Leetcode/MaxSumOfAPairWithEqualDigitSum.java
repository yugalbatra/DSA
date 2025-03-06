package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxSumOfAPairWithEqualDigitSum {

    public int maximumSum(int[] nums) {
        int maxSum = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int sum = getSum(num);
            if (map.containsKey(sum)) {
                maxSum = Math.max(maxSum, map.get(sum) + num);
                map.put(sum, Math.max(map.get(sum), num));
            }
            else {
                map.put(sum, num);
            }
        }

        return maxSum;
    }

    private int getSum(final int num) {
        if (num == 0) {
            return 0;
        }

        return num % 10 + getSum(num / 10);
    }
}
