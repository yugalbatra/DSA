package String;

import java.util.Map;

public class LongestRepeatingSubsequence {

    private int longestRepeatingSubsequence(String str, int i, int j, int[][] dp) {
        if (i == str.length() || j == str.length()) {
            return 0;
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        if (i != j && str.charAt(i) == str.charAt(j)) {
            dp[i][j] = 1 + longestRepeatingSubsequence(str, i + 1, j + 1, dp);
        }
        else {
            dp[i][j] = Math.max(longestRepeatingSubsequence(str, i + 1, j, dp), longestRepeatingSubsequence(str, i, j + 1, dp));
        }

        return dp[i][j];
    }

    public int LongestRepeatingSubsequence(String str) {
        int[][] dp = new int[str.length() + 1][str.length() + 1];

        for (int i = 1; i <= str.length(); i++) {
            for (int j = 1; j <= str.length(); j++) {
                if (i != j && str.charAt(i-1) == str.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[str.length()][str.length()];
    }
}
