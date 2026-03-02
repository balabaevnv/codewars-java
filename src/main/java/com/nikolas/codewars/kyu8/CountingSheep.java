package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Counting Sheep
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Подсчитать количество овец (true) в массиве.
 *     Массив может содержать null.
 *
 *  📊 Примеры:
 *     [true, true, false, null]  →  2
 *     [false, null, null]        →  0
 *     []                         →  0
 *
 *  ⚡ Решение:
 *     For-each с Boolean.TRUE.equals() — null-safe сравнение
 *     без отдельной проверки на null.
 *
 *  📈 Сложность: O(n) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/54edbc7200b811e956000556
 *
 */
public final class CountingSheep {

    private CountingSheep() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Считает количество овец (true) в массиве.
     *
     *  Почему Boolean.TRUE.equals():
     *     — Null-safe по дизайну: TRUE.equals(null) → false
     *     — Одна проверка вместо двух (sheep != null && sheep)
     *     — Без автоунбоксинга Boolean → boolean
     *     — Stream filter + count — 4+ служебных объектов
     *
     * @param arrayOfSheeps массив Boolean (может содержать null)
     * @return количество элементов true
     */
    public static int countSheeps(final Boolean[] arrayOfSheeps) {
        // Аккумулятор — единственная переменная
        int count = 0;
        for (final Boolean sheep : arrayOfSheeps) {
            if (Boolean.TRUE.equals(sheep)) {
                count++;
            }
        }
        return count;
    }
}