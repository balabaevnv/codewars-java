package com.nikolas.codewars.kyu8;

import java.util.*;

/**
 * Codewars Kata: Weird Java Array
 *
 * 🔗 https://www.codewars.com/kata/6607fc50c6494c000f1a08fc/train/java
 *
 * Pattern: Обход ограничений обобщённых массивов
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(n)
 */
public class Codewarrior {
    @SuppressWarnings("unchecked")
    public static List<Integer>[] arrayOfLists = (List<Integer>[]) new List[] {
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9),
    };
}