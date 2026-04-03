package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Grader
 *
 * 🔗 https://www.codewars.com/kata/53d16bd82578b1fb5b00128c/train/java
 *
 * Pattern: Условная логика с ранним возвратом
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class Grader {

    private Grader() {}

    /**
     * Возвращает оценку (A, B, C, D, F) на основе числового балла.
     *
     * @param score балл от 0.0 до 1.0 (допускаются значения вне диапазона)
     * @return символ оценки
     */
    public static char grader(double score) {
        // Защита от некорректных значений
        if (score > 1.0 || score < 0.6) {
            return 'F';
        }
        if (score >= 0.9) return 'A';
        if (score >= 0.8) return 'B';
        if (score >= 0.7) return 'C';
        return 'D';
    }
}