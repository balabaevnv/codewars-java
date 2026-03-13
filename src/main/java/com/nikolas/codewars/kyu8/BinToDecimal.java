package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Binary to Decimal
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Конвертировать бинарное число в строке в int.
 *
 *  ⚡ Решение:
 *     - Naive: справа налево суммируем степени 2
 *     - Optimal: слева направо, сдвиг << 1
 *     - Micro-opt: inline минимизируем ветвления
 *     - Streams: функциональный стиль, map + sum
 *
 *  📈 Сложность: O(n) время | O(1) память (кроме Streams)
 *
 *  🔗 https://www.codewars.com/kata/57a5c31ce298a7e6b7000334
 *
 */
public final class BinToDecimal {

    private BinToDecimal() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static int binToDecimal(final String inp) {
        int result = 0;
        for (int i = 0; i < inp.length(); i++) {
            result = (result << 1) + (inp.charAt(i) - '0');
        }
        return result;
    }
}