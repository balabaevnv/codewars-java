package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * BASIC Making Six Toast
 *
 * 🔗 https://www.codewars.com/kata/5834fec22fb0ba7d080000e8/train/java
 *
 * Pattern:
 * Math absolute difference
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class BASICMakingSixToast {

    private BASICMakingSixToast() {}

    public static int sixToast(int num) {
        return Math.abs(num - 6);
    }
}