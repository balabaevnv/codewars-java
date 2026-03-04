package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: You Only Need One - Beginner
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Проверить, содержит ли массив объект x.
 *
 *  📌 Особенности:
 *     Массив может содержать числа, строки, символы и null.
 *     x также может быть null.
 *
 *  ⚡ Решение:
 *     Линейный поиск с null-safe сравнением.
 *
 *  📈 Сложность: O(n) время | O(1) память
 *
 */
public final class YouOnlyNeedOneBeginner {

    private YouOnlyNeedOneBeginner() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Проверяет наличие элемента в массиве.
     *
     *  Почему именно так:
     *   — 1 проход
     *   — без Stream (лишние аллокации)
     *   — без Arrays.asList()
     *   — null-safe сравнение
     *   — ранний выход при нахождении
     *
     * @param a массив объектов
     * @param x искомое значение
     * @return true если найдено
     */
    public static boolean check(final Object[] a, final Object x) {

        for (Object element : a) {

            // Null-safe сравнение
            if (x == null ? element == null : x.equals(element)) {
                return true;
            }
        }

        return false;
    }
}