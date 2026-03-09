package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * My Head Is at the Wrong End!
 *
 * 🔗 https://www.codewars.com/kata/56f699cd9400f5b7d8000b55/train/java
 *
 * Pattern:
 * Reverse Fixed Array
 *
 * Условие:
 * Дается массив из 3 элементов:
 * [tail, body, head]
 *
 * Нужно вернуть:
 * [head, body, tail]
 *
 * Решение:
 * просто поменять местами первый и последний элемент.
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class MyHeadIsAtTheWrongEnd {

    private MyHeadIsAtTheWrongEnd() {}

    public static String[] fixTheMeerkat(String[] arr) {

        // Подождите, дайте проверю...
        // массив всегда из 3 элементов

        return new String[]{arr[2], arr[1], arr[0]};
    }
}