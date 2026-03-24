package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Multiple Of Index
 *
 * 🔗 https://www.codewars.com/kata/5a34b80155519e1a00000009/train/java
 *
 * Pattern:
 * Array filtering with index condition
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(k)
 */
public final class MultipleOfIndex {

    private MultipleOfIndex() {}

    public static int[] multipleOfIndex(int[] array) {
        int resultArrayLength = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 || (i != 0 && array[i] % i == 0)) {
                resultArrayLength++;
            }
        }

        int[] resultArray = new int[resultArrayLength];
        int resultArrayIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 || (i != 0 && array[i] % i == 0)) {
                resultArray[resultArrayIndex++] = array[i];
            }
        }

        return resultArray;
    }
}