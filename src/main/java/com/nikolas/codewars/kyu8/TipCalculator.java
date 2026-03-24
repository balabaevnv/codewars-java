package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Tip Calculator
 *
 * 🔗 https://www.codewars.com/kata/56598d8076ee7a0759000087/train/java
 *
 * Pattern:
 * Lookup / Mapping + Math rounding
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class TipCalculator {

    private TipCalculator() {}

    public static Integer calculateTip(double amount, String rating) {
        if (rating == null) return null;
        switch (rating.toLowerCase()) {
            case "terrible": return 0;
            case "poor": return (int) Math.ceil(amount * 0.05);
            case "good": return (int) Math.ceil(amount * 0.10);
            case "great": return (int) Math.ceil(amount * 0.15);
            case "excellent": return (int) Math.ceil(amount * 0.20);
            default: return null;
        }
    }
}