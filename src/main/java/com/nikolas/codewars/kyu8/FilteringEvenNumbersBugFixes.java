package com.nikolas.codewars.kyu8;

import java.util.List;
import java.util.ArrayList;

/**
 * Codewars Kata: Filtering even numbers (Bug Fixes)
 *
 * 🔗 https://www.codewars.com/kata/566dc566f6ea9a14b500007b/train/java
 *
 * Pattern: Удаление элементов из списка, безопасная итерация
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1) (модификация исходного списка)
 */
public final class FilteringEvenNumbersBugFixes {
    private FilteringEvenNumbersBugFixes() {}

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        if (listOfNumbers == null) {
            return new ArrayList<>();
        }
        listOfNumbers.removeIf(n -> n % 2 == 0);
        return listOfNumbers;
    }
}