package String;

public class WordWrap {

    private int wordWrap(int[] nums, int i, int k, int[] dp, int count) {
        if (i == nums.length - 1) {
            return (count == 0 ? count + nums[i] : count + nums[i] + 1) <= k ? 0 : (k - count) * (k - count);
        }

//        if (count == 0 && dp[i] != 0) {
//            return dp[i];
//        }

        if (count + nums[i] < k) {
            dp[i] = (k - count) * (k - count) + wordWrap(nums, i + 1, k, dp, count + nums[i]);
            int ans2 = wordWrap(nums, i + 1, k, dp, count == 0 ? count + nums[i] : count + nums[i] + 1);
            return Math.min(dp[i], ans2);
        }
        else {
            dp[i] = (k - count) * (k - count) + wordWrap(nums, i + 1, k, dp, count + nums[i]);
            return dp[i];
        }

    }

    public int solveWordWrap(int[] nums, int k) {
        return wordWrap(nums, 1, k, new int[nums.length], nums[0]);
    }

    public static void main(String[] args) {
        WordWrap wordWrap = new WordWrap();
        System.out.println(wordWrap.solveWordWrap(new int[] { 3, 2, 2, 5 }, 6));
    }
}
