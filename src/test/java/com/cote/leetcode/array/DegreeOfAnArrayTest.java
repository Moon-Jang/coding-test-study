package com.cote.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DegreeOfAnArrayTest {
    @Test
    void example1() {
        DegreeOfAnArray solution = new DegreeOfAnArray();
        int[] nums = {1, 2, 2, 3, 1};

        int result = solution.findShortestSubArray(nums);

        assertEquals(2, result);
    }

    @Test
    void example2() {
        DegreeOfAnArray solution = new DegreeOfAnArray();
        int[] nums = {1, 2, 2, 3, 1, 4, 2};

        int result = solution.findShortestSubArray(nums);

        assertEquals(6, result);
    }
}