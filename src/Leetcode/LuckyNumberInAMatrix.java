package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LuckyNumberInAMatrix {

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for (final int[] value : matrix) {
            int smallest = value[0];
            int smallestIndex = 0;
            for (int j = 0; j < value.length; j++) {
                if (smallest > value[j]) {
                    smallest = value[j];
                    smallestIndex = j;
                }
            }
            boolean largestInCol = true;
            for (final int[] ints : matrix) {
                if (ints[smallestIndex] > smallest) {
                    largestInCol = false;
                    break;
                }
            }
            if (largestInCol) {
                ans.add(smallest);
            }
        }

        return ans;
    }
}
