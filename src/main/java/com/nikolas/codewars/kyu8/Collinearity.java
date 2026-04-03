package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Collinearity
 *
 * 🔗 https://www.codewars.com/kata/65ba420888906c1f86e1e680/train/java
 *
 * Pattern: Проверка коллинеарности через кросс-произведение
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class Collinearity {

    private Collinearity() {}

    /**
     * Проверяет, являются ли два вектора (x1,y1) и (x2,y2) коллинеарными.
     *
     * @param x1 координата x первого вектора
     * @param y1 координата y первого вектора
     * @param x2 координата x второго вектора
     * @param y2 координата y второго вектора
     * @return true, если векторы коллинеарны
     */
    public static boolean collinearity(int x1, int y1, int x2, int y2) {
        // Используем кросс-произведение, избегая деления и переполнения
        return (long) x1 * y2 == (long) x2 * y1;
    }
}