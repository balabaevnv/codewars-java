package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * USD -> CNY
 *
 * 🔗 https://www.codewars.com/kata/5977618080ef220766000022/train/java
 *
 * Pattern:
 * Constant multiplier + decimal formatting
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class USDCNY {

    private USDCNY() {}

    public static String usdcny(int usd) {

        return String.format("%.2f Chinese Yuan", usd * 6.75);
    }
}