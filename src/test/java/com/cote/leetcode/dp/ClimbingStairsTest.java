package com.cote.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    @Test
    void example1() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(2, climbingStairs.climbStairs(2));
    }

    @Test
    void example2() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(3, climbingStairs.climbStairs(3));
    }
}