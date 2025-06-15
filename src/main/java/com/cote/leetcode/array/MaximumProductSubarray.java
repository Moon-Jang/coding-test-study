package com.cote.leetcode.array;

// https://leetcode.com/problems/maximum-product-subarray/description/
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int current = 1;

        for (int i = 0; i < nums.length; i++) {
            if (current == 0) {
                current = 1;
            }

            current *= nums[i];
            max = Math.max(current, max);
            max = Math.max(nums[i], max);
        }

        current = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (current == 0) {
                current = 1;
            }

            current *= nums[i];
            max = Math.max(current, max);
            max = Math.max(nums[i], max);
        }

        return max;
    }
}
