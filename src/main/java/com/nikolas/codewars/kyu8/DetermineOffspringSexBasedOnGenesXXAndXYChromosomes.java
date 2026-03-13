package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Determine Offspring Sex Based on Genes XX/XY
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Определить пол потомства по хромосоме сперматозоида X или Y.
 *
 *  ⚡ Решение:
 *     Naive: if/else + equals
 *     Optimal: тернарный оператор
 *
 *  📈 Сложность: O(1) время | O(1) память
 *  🔗 https://www.codewars.com/kata/56530b444e831334c0000020
 */
public final class DetermineOffspringSexBasedOnGenesXXAndXYChromosomes {

    private DetermineOffspringSexBasedOnGenesXXAndXYChromosomes() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static String chromosomeCheck(final String sperm) {
        return "XY".equals(sperm)
                ? "Congratulations! You're going to have a son."
                : "Congratulations! You're going to have a daughter.";
    }
}