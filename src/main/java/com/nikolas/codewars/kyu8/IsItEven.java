package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 *
 * Is it even?
 *
 * 🔗 https://www.codewars.com/kata/555a67db74814aa4ee0001b5/train/java
 *
 * Задача:
 * Определить, является ли число чётным.
 *
 * Особенности:
 * - входной тип double
 * - если есть дробная часть → число считается НЕчетным
 *
 * Алгоритм:
 * Проверяем остаток от деления на 2.
 *
 * n % 2 == 0
 *
 * Если остаток 0 → число чётное.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public final class IsItEven {

    private IsItEven() {
        // utility class
    }

    public static boolean isEven(double n) {

        // проверка четности
        return n % 2 == 0;
    }
}