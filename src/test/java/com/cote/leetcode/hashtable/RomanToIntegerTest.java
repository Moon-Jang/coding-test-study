package com.cote.leetcode.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    @Test
    void example1() {
        RomanToInteger solution = new RomanToInteger();
        String s = "III";
        assertEquals(3, solution.romanToInt(s));
    }

    @Test
    void example2() {
        RomanToInteger solution = new RomanToInteger();
        String s = "LVIII";
        assertEquals(58, solution.romanToInt(s));
    }

    @Test
    void example3() {
        RomanToInteger solution = new RomanToInteger();
        String s = "MCMXCIV";
        assertEquals(1994, solution.romanToInt(s));
    }
}