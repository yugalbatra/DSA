package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class MaxNumberOfIntegersToChooseFrom {

    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for (int i : banned) {
            set.add(i);
        }

        int count = 0, sum = 0;
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                continue;
            }
            if (sum + i > maxSum) {
                break;
            }
            count++;
            sum += i;
        }

        return count;
    }
}
