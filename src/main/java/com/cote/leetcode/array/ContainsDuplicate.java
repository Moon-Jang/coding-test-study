package com.cote.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> historySet = new HashSet<>();

        for (int num : nums) {
            if (historySet.contains(num)) {
                return true;
            } else {
                historySet.add(num);
            }
        }

        return false;
    }
}
