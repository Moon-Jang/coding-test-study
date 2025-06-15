package com.cote.leetcode.array;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int total = 0;
        int max = nums[0];

        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }

            total += n;
            max = Math.max(total, max);
        }

        return max;
    }
}
