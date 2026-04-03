package com.nikolas.codewars.kyu8;

import java.util.Arrays;

/**
 * Codewars Kata: Merging sorted integer arrays (without duplicates)
 *
 * 🔗 https://www.codewars.com/kata/573f5c61e7752709df0005d2/train/java
 *
 * Pattern: Двухпроходное слияние с пропуском дубликатов
 *
 * Complexity:
 * Time  : O(n + m)
 * Memory: O(n + m)
 */
public final class MergingSortedIntegerArraysWithoutDuplicates {

    private MergingSortedIntegerArraysWithoutDuplicates() {}

    public static int[] mergeArrays(int[] first, int[] second) {
        if (first == null) first = new int[0];
        if (second == null) second = new int[0];
        int n1 = first.length, n2 = second.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            int a = first[i];
            int b = second[j];
            if (a < b) {
                if (k == 0 || result[k - 1] != a) result[k++] = a;
                i++;
            } else if (a > b) {
                if (k == 0 || result[k - 1] != b) result[k++] = b;
                j++;
            } else { // equal
                if (k == 0 || result[k - 1] != a) result[k++] = a;
                i++;
                j++;
            }
        }

        while (i < n1) {
            int a = first[i];
            if (k == 0 || result[k - 1] != a) result[k++] = a;
            i++;
        }

        while (j < n2) {
            int b = second[j];
            if (k == 0 || result[k - 1] != b) result[k++] = b;
            j++;
        }

        return Arrays.copyOf(result, k);
    }
}