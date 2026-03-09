package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Expressions Matter
 *
 * 🔗 https://www.codewars.com/kata/5ae62fcf252e66d44d00008e/train/java
 *
 * Pattern:
 * Small Search Space Enumeration
 *
 * Идея:
 * Перебираем все возможные выражения
 * и возвращаем максимальное значение.
 *
 * Возможные выражения:
 *
 * a + b + c
 * a * b * c
 * (a + b) * c
 * a * (b + c)
 * a + b * c
 * a * b + c
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class ExpressionsMatter {

    private ExpressionsMatter() {}

    public static int expressionsMatter(int a, int b, int c) {

        int max = a + b + c;

        max = Math.max(max, a * b * c);
        max = Math.max(max, (a + b) * c);
        max = Math.max(max, a * (b + c));
        max = Math.max(max, a + b * c);
        max = Math.max(max, a * b + c);

        return max;
    }
}