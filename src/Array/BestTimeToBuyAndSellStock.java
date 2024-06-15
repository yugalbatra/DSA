package Array;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int minTillNow = prices[0], maxDiff = 0;
        for (int i : prices) {
            minTillNow = Math.min(minTillNow, i);
            maxDiff = Math.max(maxDiff, i - minTillNow);
        }

        return maxDiff;
    }
}
