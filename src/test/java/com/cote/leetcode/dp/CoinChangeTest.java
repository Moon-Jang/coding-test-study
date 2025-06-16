package com.cote.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {
    @Test
    void example1() {
        CoinChange solution = new CoinChange();
        int[] coins = {1, 2, 5};
        int amount = 11;

        int result = solution.coinChange(coins, amount);

        assertEquals(3, result);
    }

    @Test
    void example2() {
        CoinChange solution = new CoinChange();
        int[] coins = {2};
        int amount = 3;

        int result = solution.coinChange(coins, amount);

        assertEquals(-1, result);
    }

    @Test
    void example3() {
        CoinChange solution = new CoinChange();
        int[] coins = {1};
        int amount = 0;

        int result = solution.coinChange(coins, amount);

        assertEquals(0, result);
    }

    @Test
    void example4() {
        CoinChange solution = new CoinChange();
        int[] coins = {2,5,10};
        int amount = 9;

        int result = solution.coinChange(coins, amount);

        assertEquals(3, result);
    }

    @Test
    void example5() {
        CoinChange solution = new CoinChange();
        int[] coins = {2,5,10,1};
        int amount = 27;

        int result = solution.coinChange(coins, amount);

        assertEquals(4, result);
    }
}