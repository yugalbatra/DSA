package Array;

import java.util.HashMap;
import java.util.Map;

public class BuySellShareAtMostTwice {

    public static int maxProfit(int[] prices, boolean bought, int i, int k, int profit, Map<String, Integer> map) {
        if (k == 0 || i == prices.length) {
            return profit;
        }

        String key = i + "";
        if (map.containsKey(key)) {
            return map.get(key);
        }

        int one, two;
        if (bought) {
            one = maxProfit(prices, false, i + 1, k - 1, profit + prices[i], map);
            two = maxProfit(prices, true, i + 1, k, profit, map);
        }
        else {
            one = maxProfit(prices, true, i + 1, k, profit - prices[i], map);
            two = maxProfit(prices, false, i + 1, k, profit, map);
        }
        map.put(key, Math.max(one, two));
        return Math.max(one, two);
    }

    public static int maxProfit(int n, int[] price) {
        return maxProfit(price, false, 0, 2, 0, new HashMap<>());
    }

    public static int maxProfitGreedy(int n, int[] price) {
        int firstBuy = Integer.MIN_VALUE, secondBuy = Integer.MIN_VALUE;
        int firstSell = 0, secondSell = 0;
        for (int i: price) {
            firstBuy = Math.max(firstBuy, -i);
            firstSell = Math.max(firstSell, firstBuy + i);
            secondBuy = Math.max(secondBuy, firstSell - i);
            secondSell = Math.max(secondSell, secondBuy + i);
        }

        return secondSell;
    }
}
