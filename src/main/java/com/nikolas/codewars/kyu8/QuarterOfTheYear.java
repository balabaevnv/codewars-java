package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Quarter of the year
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Определить квартал по номеру месяца.
 *
 *  ⚡ Решение:
 *     Используем простые условия для определения квартала.
 *
 *  📈 Сложность: O(1)
 *
 */
public final class QuarterOfTheYear {

    private QuarterOfTheYear() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Определяет квартал года по номеру месяца.
     *
     * @param month номер месяца
     * @return номер квартала
     */
    public static int quarterOf(int month) {
        if (month <= 3) return 1;
        if (month <= 6) return 2;
        if (month <= 9) return 3;
        return 4;
    }
}