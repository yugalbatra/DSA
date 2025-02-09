package DP;

public class CoinChange {

    public long count(int[] coins, int N, int sum) {
        long[] dp = new long[sum + 1];
        dp[0] = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j >= coins[i]) {
                    dp[j] += dp[j - coins[i]];
                }
            }
        }

        return dp[sum];
    }
}
