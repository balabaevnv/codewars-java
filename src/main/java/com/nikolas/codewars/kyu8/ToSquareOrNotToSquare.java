package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: To Square Or Not To Square
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Для массива чисел:
 *       - если число имеет целый квадратный корень, взять его
 *       - иначе возвести число в квадрат
 *
 *  📈 Сложность: O(n) время | O(n) память
 *  🔗 https://www.codewars.com/kata/57f6ad55cca6e045d2000627
 */
public final class ToSquareOrNotToSquare {

    private ToSquareOrNotToSquare() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static int[] squareOrSquareRoot(final int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            double sqrt = Math.sqrt(array[i]);
            result[i] = (sqrt == (int) sqrt) ? (int) sqrt : array[i] * array[i];
        }
        return result;
    }
}