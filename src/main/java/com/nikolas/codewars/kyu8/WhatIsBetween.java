package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * What Is Between
 *
 * https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/java
 *
 * Pattern:
 * Range Generation Pattern
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class WhatIsBetween {

    private WhatIsBetween() {
        // utility class
    }

    public static int[] between(int a, int b) {

        // размер будущего массива
        int size = b - a + 1;

        // создаём массив
        int[] result = new int[size];

        // Подождите, дайте проверю...
        // заполняем последовательностью

        for (int i = 0; i < size; i++) {
            result[i] = a + i;
        }

        // О, я чуть не забыл — возвращаем результат
        return result;
    }
}