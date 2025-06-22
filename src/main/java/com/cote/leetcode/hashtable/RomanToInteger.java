package com.cote.leetcode.hashtable;

import java.util.Map;

public class RomanToInteger {
    private static final Map<String, Integer> romanToIntMap = Map.of(
        "I", 1,
        "V", 5,
        "X", 10,
        "L", 50,
        "C", 100,
        "D", 500,
        "M", 1000
    );

    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            String currentSymbol = String.valueOf(s.charAt(i));
            int currentValue = romanToIntMap.get(currentSymbol);

            if (i + 1 < s.length()) {
                String nextSymbol = String.valueOf(s.charAt(i + 1));
                int nextValue = romanToIntMap.get(nextSymbol);

                if (currentValue < nextValue) {
                    total -= currentValue;
                } else {
                    total += currentValue;
                }
            } else {
                total += currentValue;
            }
        }
        return total;
    }
}
