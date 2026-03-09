package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 *
 * Get the mean of an array
 *
 * 🔗 https://www.codewars.com/kata/563e320cee5dddcf77000158/train/java
 *
 * Задача:
 * Найти среднее значение массива целых чисел.
 *
 * Требования:
 * - массив никогда не пустой
 * - результат округляется вниз
 *
 * Алгоритм:
 * 1. Просуммировать элементы массива
 * 2. Разделить на количество элементов
 *
 * В Java деление int / int уже делает округление вниз.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public final class GetTheMeanOfAnArray {

    private GetTheMeanOfAnArray() {
        // utility class
    }

    public static int getAverage(int[] marks) {

        int sum = 0;

        // суммируем элементы массива
        for (int m : marks) {
            sum += m;
        }

        // возвращаем среднее значение
        return sum / marks.length;
    }
}