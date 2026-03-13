package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Gravity Flip
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Переставить кубики в ящике влево или вправо по направлению гравитации.
 *
 *  ⚡ Решение:
 *     Arrays.sort + in-place reverse для 'L', clone массива для безопасности.
 *
 *  📈 Сложность: O(n log n) время | O(n) память
 *  🔗 https://www.codewars.com/kata/5f70c883e10f9e0001c89673
 */
public final class GravityFlip {

    private GravityFlip() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    public static int[] flip(final char dir, final int[] arr) {
        int[] result = arr.clone();
        java.util.Arrays.sort(result);
        if (dir == 'L') {
            for (int i = 0, j = result.length - 1; i < j; i++, j--) {
                int tmp = result[i];
                result[i] = result[j];
                result[j] = tmp;
            }
        }
        return result;
    }
}