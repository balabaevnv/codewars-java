package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Find Multiples of a Number
 *
 * 🔗 https://www.codewars.com/kata/58ca658cc0d6401f2700045f/train/java
 *
 * Pattern:
 * Generate Arithmetic Progression
 *
 * Условие:
 * Вернуть массив кратных base до limit.
 *
 * Последовательность:
 * base, 2*base, 3*base ... <= limit
 *
 * Размер массива:
 * size = limit / base
 *
 * Сложность:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class FindMultiplesOfANumber {

    private FindMultiplesOfANumber() {}

    public static int[] find(int base, int limit) {

        // Подождите, дайте проверю...
        // Количество элементов равно количеству кратных base до limit
        int size = limit / base;

        int[] result = new int[size];

        // О, я упустил — массив заполняем арифметической прогрессией
        for (int i = 0; i < size; i++) {
            result[i] = base * (i + 1);
        }

        return result;
    }
}