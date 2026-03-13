package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Surface Area and Volume of a Box
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Вернуть площадь поверхности и объём параллелепипеда.
 *
 *  ⚡ Решение:
 *     - Формулы: volume = w*h*d, surface = 2*(wh + hd + wd)
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/565f5825379664a26b00007c
 *
 */
public final class SurfaceAreaAndVolumeOfABox {

    private SurfaceAreaAndVolumeOfABox() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static int[] getSize(int w, int h, int d) {
        return new int[]{2*(w*h + h*d + w*d), w*h*d};
    }
}