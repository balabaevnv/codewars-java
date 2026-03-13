package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: No Zeros for Heroes
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Удалить все конечные нули числа, оставить знак.
 *
 *  ⚡ Решение:
 *     - Naive / Optimal: цикл деления на 10
 *     - Micro-opt: учитываем знак заранее
 *     - Streams: строковое представление (не оптимально)
 *
 *  📈 Сложность: O(log₁₀(n)) время | O(1) память (кроме String variant)
 *
 *  🔗 https://www.codewars.com/kata/570a6a46455d08ff8d001002
 *
 */
public final class NoZerosForHeroes {

    private NoZerosForHeroes() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static int noBoringZeros(final int n) {
        if (n == 0) return 0;
        int num = n;
        while (num % 10 == 0) num /= 10;
        return num;
    }
}