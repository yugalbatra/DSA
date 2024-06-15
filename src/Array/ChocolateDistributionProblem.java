package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistributionProblem {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        long minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - m + 1; i++) {
            minDiff = Math.min(minDiff, a.get(i + m - 1) - a.get(i));
        }

        return minDiff;
    }
}
