package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 *
 * Removing Elements
 *
 * 🔗 https://www.codewars.com/kata/5769b3802ae6f8e4890009d2/train/java
 *
 * Задача:
 * Удалить каждый второй элемент массива.
 * Всегда сохраняем первый элемент.
 *
 * Пример:
 * ["Keep","Remove","Keep","Remove","Keep"]
 * ->
 * ["Keep","Keep","Keep"]
 *
 * Алгоритм:
 * 1. Создаём новый массив размером (n + 1) / 2
 * 2. Копируем элементы с шагом 2
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n/2)
 */
public final class RemovingElements {

    private RemovingElements() {
        // utility class
    }

    public static Object[] removeEveryOther(Object[] arr) {

        int resultSize = (arr.length + 1) / 2;

        Object[] result = new Object[resultSize];

        int j = 0;

        // копируем каждый второй элемент
        for (int i = 0; i < arr.length; i += 2) {
            result[j++] = arr[i];
        }

        return result;
    }
}