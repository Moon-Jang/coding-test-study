package com.cote.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayTest {
    @Test
    void example1() {
        MaximumProductSubarray solution = new MaximumProductSubarray();
        int[] nums = {2, 3, -2, 4};

        int result = solution.maxProduct(nums);

        assertEquals(6, result);
    }

    @Test
    void example2() {
        MaximumProductSubarray solution = new MaximumProductSubarray();
        int[] nums = {-2, 0, -1};

        int result = solution.maxProduct(nums);

        assertEquals(0, result);
    }

    @Test
    void example3() {
        MaximumProductSubarray solution = new MaximumProductSubarray();
        int[] nums = {2, -5, -2, -4, 3};

        int result = solution.maxProduct(nums);

        assertEquals(24, result);
    }
}