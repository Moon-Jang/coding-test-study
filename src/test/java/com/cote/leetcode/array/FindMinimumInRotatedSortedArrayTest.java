package com.cote.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {
    @Test
    void example1() {
        FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();
        int[] nums = {3, 4, 5, 1, 2};
        assertEquals(1, solution.findMin(nums));
    }

    @Test
    void example2() {
        FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, solution.findMin(nums));
    }

    @Test
    void example3() {
        FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();
        int[] nums = {11, 13, 15, 17};
        assertEquals(11, solution.findMin(nums));
    }

    @Test
    void example4() {
        FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();
        int[] nums = {2, 4, 5, 6, 7, 0, 1};
        assertEquals(0, solution.findMin(nums));
    }
}