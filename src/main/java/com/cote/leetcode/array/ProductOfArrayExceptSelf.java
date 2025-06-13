package com.cote.leetcode.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = getZeroCount(nums);
        int[] result = new int[nums.length];

        if (zeroCount > 1) {
            return new int[nums.length];
        }

        int multi = Arrays.stream(nums).reduce((x, y) -> x * y).orElse(0);

        if (zeroCount == 1) {
            int zeroIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    zeroIndex = i;
                    break;
                }
            }

            int r = 1;
            for (int i = 0; i < nums.length; i++) {
                if (i == zeroIndex) continue;
                r *= nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                if (i == zeroIndex) {
                    result[i] = r;
                    continue;
                }
                result[i] = 0;
             }

            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = multi / nums[i];
        }

        return result;
    }

    public int getZeroCount(int[] nums) {
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            }
        }
        return zeroCount;
    }
}
