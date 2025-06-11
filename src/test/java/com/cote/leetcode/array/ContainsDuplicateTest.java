package com.cote.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void example1() {
        // 예시 1: nums = [1,2,3,1]
        // 1이 인덱스 0과 3에 두 번 나타나므로 true를 반환해야 함
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};

        boolean result = solution.containsDuplicate(nums);

        assertTrue(result);
    }

    @Test
    void example2() {
        // 예시 2: nums = [1,2,3,4]
        // 모든 요소가 고유하므로 false를 반환해야 함
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4};

        boolean result = solution.containsDuplicate(nums);

        assertFalse(result);
    }

    @Test
    void example3() {
        // 예시 3: nums = [1,1,1,3,3,4,3,2,4,2]
        // 여러 중복 요소가 존재하므로 true를 반환해야 함
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        boolean result = solution.containsDuplicate(nums);

        assertTrue(result);
    }
}