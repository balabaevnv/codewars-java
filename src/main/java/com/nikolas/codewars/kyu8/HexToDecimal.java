package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Hex to Decimal
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Преобразовать шестнадцатеричное число (строка) в десятичное.
 *
 *  📊 Примеры:
 *     "1"  -> 1
 *     "a"  -> 10
 *     "10" -> 16
 *     "FF" -> 255
 *     "-C" -> -12
 *
 *  ⚡ Решение:
 *     Используем встроенный Integer.parseInt(hex, 16)
 *     - Минимум кода
 *     - Поддержка отрицательных чисел
 *     - JVM оптимизация для radix
 *
 *  📈 Сложность: O(n) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/57a4d500e298a7952100035d
 *
 */
public final class HexToDecimal {

    private HexToDecimal() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Преобразует hex строку в десятичное число.
     * @param hexString hex число (может быть отрицательным)
     * @return decimal int
     */
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }
}