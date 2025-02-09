package DP;

import java.nio.file.WatchEvent;

public class Knapsack {

    private static int max = 0;

    static int knapSack(int W, int[] wt, int[] val) {
        int[] dp = new int[W + 1];
        for (int i = 0; i < wt.length; i++) {
            for (int j = W; j >= wt[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - wt[i]] + val[i]);
            }
        }

        return dp[W];
    }

    static int knapSackRecusive(int W, int[] wt, int[] val) {
        max = 0;
        knapSack(W, wt, val, 0, 0);
        return max;
    }

    private static void knapSack(int weight, int[] weights, int[] values, int sum, int i) {
        if (weight < 0) {
            return;
        }
        max = Math.max(sum, max);
        if (i == weights.length) {
            return;
        }
        knapSack(weight - weights[i], weights, values, sum + values[i], i + 1);
        knapSack(weight, weights, values, sum, i + 1);
    }
}
