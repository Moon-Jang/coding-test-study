package com.cote.leetcode.dp;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        if (amount == 0 ) return 0;

        for (int i = 1; i < dp.length; i++) {
            for (int coin : coins) {
                if (i % coin == 0) {
                    dp[i] = (dp[i] != 0)
                        ? Math.min(dp[i], i / coin)
                        : i / coin;
                }

                if (i - coin > 0 && dp[i - coin] != 0) {
                    dp[i] = (dp[i] != 0)
                        ? Math.min(dp[i], dp[i - coin] + 1)
                        : dp[i - coin] + 1;
                }
            }
            System.out.println(dp[i]);
        }

        return dp[amount] != 0
            ? dp[amount]
            : -1;
    }
}
