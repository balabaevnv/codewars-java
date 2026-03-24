package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * CSV Representation Of Array
 *
 * 🔗 https://www.codewars.com/kata/5a34af40e1ce0eb1f5000036/train/java
 *
 * Pattern:
 * 2D array traversal + delimiter joining
 *
 * Complexity:
 * Time  : O(n*m)
 * Memory: O(n*m)
 */
public final class CSVRepresentationOfArray {

    private CSVRepresentationOfArray() {}

    public static String toCsvText(int[][] array){

        // Подождите, дайте проверю…
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {

            int[] row = array[i];

            for (int j = 0; j < row.length; j++) {

                sb.append(row[j]);

                // О, я упустил… не добавлять запятую в конце строки
                if (j < row.length - 1) {
                    sb.append(',');
                }
            }

            // О, я упустил… последняя строка без \n
            if (i < array.length - 1) {
                sb.append('\n');
            }
        }

        return sb.toString();
    }
}