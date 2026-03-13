package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Printing Array Elements With Comma Delimiters
 *
 * 🔗 https://www.codewars.com/kata/56e2f59fb2ed128081001328/train/java
 *
 * Задача:
 * вернуть строку с элементами массива,
 * разделенными запятой.
 *
 * Input:
 * Object[] array
 *
 * Example:
 * ["h","o","l","a"] -> "h,o,l,a"
 *
 * Algorithm:
 * manual join через StringBuilder
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 *
 * Cache friendliness:
 * последовательная запись в char buffer
 */
public final class PrintingArrayElementsWithCommaDelimiters {

    private PrintingArrayElementsWithCommaDelimiters() {}

    public static String printArray(Object[] array) {

        // пустой массив
        if (array.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {

            // append element
            sb.append(array[i]);

            // добавляем запятую кроме последнего элемента
            if (i < array.length - 1) {
                sb.append(",");
            }
        }

        return sb.toString();
    }
}