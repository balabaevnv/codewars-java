package com.nikolas.codewars.kyu8;

/**
 * Codewars:
 * <a href="https://www.codewars.com/kata/53da3dbb4a5168369a0000fe">Even or Odd</a>
 *
 * <p>Определяет чётность целого числа.</p>
 */
public final class EvenOrOdd {

    // Утилитарный класс — инстанцирование запрещено
    private EvenOrOdd() {
        throw new UnsupportedOperationException("Utility class");
    }
    /**
     * O(1) время и O(1) память
     *
     * <p>Используется побитовое И: младший бит (LSB) у чётного числа
     * равен 0, у нечётного — 1. Выражение {@code number & 1}
     * изолирует LSB и мгновенно определяет чётность.</p>
     *
     * <p>Корректно работает для отрицательных чисел и нуля,
     * LSB определяет чётность независимо от знака.</p>
     *
     * @param number целое число (положительное, отрицательное или ноль)
     * @return {@code "Even"} если число чётное, {@code "Odd"} если нечётное
     */
    public static String evenOrOdd(final int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
}