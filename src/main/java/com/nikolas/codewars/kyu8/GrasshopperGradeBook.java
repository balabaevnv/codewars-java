package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Grasshopper - Grade book
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Найти среднее трёх оценок и вернуть буквенную оценку.
 *
 *  ⚡ Решение:
 *     1. Вычисляем целочисленное среднее.
 *     2. Проверяем диапазоны сверху вниз.
 *
 *  📈 Сложность: O(1)
 *
 */
public final class GrasshopperGradeBook {

    private GrasshopperGradeBook() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Возвращает буквенную оценку по среднему баллу.
     *
     * @param s1 первая оценка
     * @param s2 вторая оценка
     * @param s3 третья оценка
     * @return буквенная оценка
     */
    public static char getGrade(final int s1, final int s2, final int s3) {

        final int average = (s1 + s2 + s3) / 3;

        if (average >= 90) return 'A';
        if (average >= 80) return 'B';
        if (average >= 70) return 'C';
        if (average >= 60) return 'D';

        return 'F';
    }
}