package com.cote.leetcode.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// https://leetcode.com/problems/degree-of-an-array/description/
public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> firstMap = new HashMap<>();
        Map<Integer, Integer> lastMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            map.put(n, map.getOrDefault(n, 0) + 1);
            firstMap.putIfAbsent(n, i);
            lastMap.put(n, i);
        }

        int maxCnt = map.values()
            .stream()
            .mapToInt(Integer::intValue)
            .max()
            .orElseThrow();

        if (maxCnt == 1) {
            return 1;
        }

        List<Integer> frequencyNumbers = map.keySet()
            .stream()
            .filter(key -> map.get(key).equals(maxCnt))
            .collect(Collectors.toList());

        return frequencyNumbers.stream()
            .mapToInt(n -> lastMap.get(n) - firstMap.get(n) + 1)
            .min()
            .orElseThrow();
    }
}
