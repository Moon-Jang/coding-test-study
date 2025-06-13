package com.cote.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {
    @Test
    void example1() {
        // 예시 1: nums = [1,2,3,4]
        // 결과: [24,12,8,6]
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};

        int[] result = solution.productExceptSelf(nums);

        assertArrayEquals(new int[]{24, 12, 8, 6}, result);
    }

    @Test
    void example2() {
        // 예시 2: nums = [-1,1,0,-3,3]
        // 결과: [0,0,9,0,0]
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = {-1, 1, 0, -3, 3};

        int[] result = solution.productExceptSelf(nums);

        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, result);
    }

    // 예시 3: nums = [0, 3, 1, 0]
    // 결과: [0, 0, 0, 0]
    @Test
    void example3() {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = {0, 3, 1, 0};

        int[] result = solution.productExceptSelf(nums);

        assertArrayEquals(new int[]{0, 0, 0, 0}, result);
    }
}