package Neetcode.SlidingWindow;

import java.util.HashSet;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minTillNow = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minTillNow = Math.min(minTillNow, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minTillNow);
        }

        return maxProfit;
    }
}
