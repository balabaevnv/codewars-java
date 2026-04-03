package com.nikolas.codewars.kyu8;

import java.util.List;

/**
 * Codewars Kata: Sort My Textbooks
 *
 * 🔗 https://www.codewars.com/kata/5a07e5b7ffe75fd049000051/train/java
 *
 * Pattern: Сортировка без учёта регистра
 *
 * Complexity:
 * Time  : O(n log n)
 * Memory: O(1) (сортировка на месте)
 */
public final class SortMyTextbooks {
    private SortMyTextbooks() {}

    public static List<String> sort(List<String> textbooks) {
        if (textbooks == null) {
            return new java.util.ArrayList<>();
        }
        textbooks.sort(String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }
}