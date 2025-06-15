package com.cote.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {
    @Test
    void example1() {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = solution.maxSubArray(nums);

        assertEquals(6, result);
    }

    @Test
    void example2() {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {1};

        int result = solution.maxSubArray(nums);

        assertEquals(1, result);
    }

    @Test
    void example3() {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {5, 4, -1, 7, 8};

        int result = solution.maxSubArray(nums);

        assertEquals(23, result);
    }

    @Test
    void example4() {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4, 5};

        int result = solution.maxSubArray(nums);

        assertEquals(10, result);
    }
}