package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Is N Divisible by X and Y
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Проверить, делится ли число n на два числа x и y.
 *
 *  ⚡ Решение:
 *     Проверяем, делится ли n на оба числа с использованием оператора %.
 *
 *  📈 Сложность: O(1)
 *
 *  🔗 https://www.codewars.com/kata/5545f109004975ea66000086
 */
public final class IsNDivisibleByXAndY {

    private IsNDivisibleByXAndY() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Проверяет, делится ли число n на оба числа x и y.
     *
     * @param n число для проверки
     * @param x первое число
     * @param y второе число
     * @return true, если n делится на x и y, иначе false
     */
    public static boolean isDivisible(long n, long x, long y) {
        return (n % x == 0) && (n % y == 0);
    }
}