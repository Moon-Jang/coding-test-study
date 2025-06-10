package com.cote.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void example1() {
        // 예시 1: 가격이 [7,1,5,3,6,4]일 때
        // 2일째(가격=1)에 매수하고 5일째(가격=6)에 매도하면 이익은 6-1=5
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = solution.maxProfit(prices);

        assertEquals(5, result);
    }

    @Test
    void example2() {
        // 예시 2: 가격이 [7,6,4,3,1]일 때
        // 계속 하락하므로 거래하지 않는 것이 최선이며 최대 이익은 0
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 6, 4, 3, 1};

        int result = solution.maxProfit(prices);

        assertEquals(0, result);
    }

    @Test
    void example3() {
        // 예시 2: 가격이 [7,6,4,3,1]일 때
        // 계속 하락하므로 거래하지 않는 것이 최선이며 최대 이익은 0
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {99, 100, 3, 6, 15};

        int result = solution.maxProfit(prices);

        assertEquals(12, result);
    }

    @Test
    void example4() {
        // 예시 2: 가격이 [7,6,4,3,1]일 때
        // 계속 하락하므로 거래하지 않는 것이 최선이며 최대 이익은 0
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {2, 4, 1};

        int result = solution.maxProfit(prices);

        assertEquals(2, result);
    }
}