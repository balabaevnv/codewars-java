package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Convert Non-negative Integer to Binary as Decimal
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Преобразовать число n в число, где двоичное представление n
 *     становится десятичным числом.
 *
 *  ⚡ Решение:
 *     Naive: Integer.toBinaryString + parseInt
 *     Optimal: bitwise manual calculation
 *
 *  📈 Сложность: O(log n) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/59fca81a5712f9fa4700159a
 *
 */
public final class ConvertToBinary {

    private ConvertToBinary() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static int toBinary(final int n) {
        int result = 0, multiplier = 1;
        int num = n;
        while (num > 0) {
            result += (num % 2) * multiplier;
            num /= 2;
            multiplier *= 10;
        }
        return result;
    }
}