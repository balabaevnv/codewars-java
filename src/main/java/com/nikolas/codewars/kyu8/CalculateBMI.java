package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Calculate BMI
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Рассчитать индекс массы тела:
 *
 *         bmi = weight / (height * height)
 *
 *  📊 Категории:
 *     bmi ≤ 18.5 → "Underweight"
 *     bmi ≤ 25.0 → "Normal"
 *     bmi ≤ 30.0 → "Overweight"
 *     bmi > 30   → "Obese"
 *
 *  ⚡ Решение:
 *     Линейная цепочка if без else.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/57a429e253ba3381850000fb
 *
 */
public final class CalculateBMI {

    private CalculateBMI() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Вычисляет индекс массы тела и возвращает категорию.
     *
     *  Почему именно так:
     *   — 1 вычисление BMI
     *   — 3 сравнения
     *   — нет вложенных else
     *   — нет Stream
     *   — нет BigDecimal (избыточно)
     *   — литералы строк интернированы JVM
     *
     * @param weight вес
     * @param height рост
     * @return категория BMI
     */
    public static String bmi(final double weight, final double height) {

        // Вычисляем индекс массы тела
        final double bmi = weight / (height * height);

        // Линейная проверка диапазонов
        if (bmi <= 18.5) {
            return "Underweight";
        }

        if (bmi <= 25.0) {
            return "Normal";
        }

        if (bmi <= 30.0) {
            return "Overweight";
        }

        return "Obese";
    }
}