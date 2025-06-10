package com.cote.leetcode.array;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - min;
            result = Math.max(result, profit);
            min = Math.min(min, prices[i]);
        }

        return result;
    }
}
