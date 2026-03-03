package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Beginner — Lost Without a Map
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Вернуть НОВЫЙ массив, где каждый элемент удвоен.
 *
 *  📊 Примеры:
 *     [1, 2, 3]        →  [2, 4, 6]
 *     [4, 1, 1, 1, 4]  →  [8, 2, 2, 2, 8]
 *
 *  ⚡ Решение:
 *     For с новым массивом. Одна аллокация, один проход.
 *     Без мутации входного массива.
 *
 *  📈 Сложность: O(n) время | O(n) память
 *
 *  🔗 https://www.codewars.com/kata/57f781872e3d8ca2a000007e
 *
 */
public final class BeginnerLostWithoutAMap {

    private BeginnerLostWithoutAMap() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Возвращает новый массив с удвоенными значениями.
     *
     *  Почему for с новым массивом:
     *     — 1 аллокация: int[] нужного размера
     *     — Без мутации входа (задача: "return a new array")
     *     — IntStream.map.toArray(): 3+ служебных объектов
     *     — for-each: не даёт индекс для записи в result
     *
     * @param arr входной массив целых чисел
     * @return новый массив с удвоенными значениями
     */
    public static int[] map(final int[] arr) {
        // Новый массив — не мутируем вход
        final int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * 2;
        }
        return result;
    }
}