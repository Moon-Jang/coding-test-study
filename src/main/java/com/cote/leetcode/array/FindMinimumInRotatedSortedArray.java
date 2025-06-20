package com.cote.leetcode.array;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        Integer result = 5001;
        return search(nums, 0, (nums.length - 1) / 2, nums.length - 1, result);
    }

    public int search(int[] nums, int left, int mid, int right, Integer result) {
        if (mid < left || mid > right) return result;

        result = Math.min(result, nums[mid]);
        result = search(nums, left, ((mid + left - 1) / 2), mid - 1, result);
        result = search(nums, mid + 1, ((mid + right  + 1) / 2), right, result);

        return result;
    }
}
