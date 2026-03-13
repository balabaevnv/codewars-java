package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Well of Ideas - Easy Version
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Подсчитать количество "good" в массиве идей.
 *     0 good → "Fail!", 1-2 → "Publish!", >2 → "I smell a series!"
 *
 *  ⚡ Решение:
 *     Naive: обычный цикл
 *     Optimal: Stream count
 *     Micro-opt: ранний выход при count>2
 *
 *  📈 Сложность: O(n) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/57f222ce69e09c3630000212
 *
 */
public final class WellOfIdeasEasyVersion {

    private WellOfIdeasEasyVersion() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static String well(final String[] x) {
        int count = 0;
        for (String s : x) {
            if ("good".equals(s)) {
                count++;
                if (count > 2) return "I smell a series!";
            }
        }
        return count == 0 ? "Fail!" : "Publish!";
    }
}