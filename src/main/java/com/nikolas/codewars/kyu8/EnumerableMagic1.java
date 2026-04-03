package com.nikolas.codewars.kyu8;

import java.util.function.IntPredicate;

/**
 * Codewars Kata: Enumerable Magic #1 - True for All?
 *
 * 🔗 https://www.codewars.com/kata/54598d1fcbae2ae05200112c/train/java
 *
 * Pattern: Итерация с ранним выходом
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class EnumerableMagic1 {

    private EnumerableMagic1() {}

    /**
     * Проверяет, удовлетворяет ли каждый элемент массива заданному предикату.
     *
     * @param list      массив целых чисел
     * @param predicate тестирующий предикат
     * @return true, если все элементы проходят проверку, иначе false.
     *         Для пустого массива возвращает true.
     */
    public static boolean all(int[] list, IntPredicate predicate) {
        if (list == null) return true;
        for (int num : list) {
            if (!predicate.test(num)) {
                return false;
            }
        }
        return true;
    }
}