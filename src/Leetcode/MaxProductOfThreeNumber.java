package Leetcode;

import java.sql.Array;
import java.util.Arrays;

public class MaxProductOfThreeNumber {

    public int maximumProduct(int[] nums) {
        int[] min = new int[2];
        int[] max = new int[3];
        Arrays.fill(max, Integer.MIN_VALUE);
        Arrays.fill(min, Integer.MAX_VALUE);
        for (int num : nums) {
            if (num > max[0]) {
                max[2] = max[1];
                max[1] = max[0];
                max[0] = num;
            } else if (num > max[1]) {
                max[2] = max[1];
                max[1] = num;
            } else if (num > max[2]) {
                max[2] = num;
            }

            if (num < min[0]) {
                min[1] = min[0];
                min[0] = num;
            } else if (num < min[1]) {
                min[1] = num;
            }
        }

        return Math.max(max[0] * min[0] * min[1], max[0] * max[1] * max[2]);
    }
}