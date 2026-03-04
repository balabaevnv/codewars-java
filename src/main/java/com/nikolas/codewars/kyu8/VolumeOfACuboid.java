package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Volume of a Cuboid
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Необходимо вычислить объем прямоугольного параллелепипеда по формуле:
 *     volume = length × width × height.
 *
 *  ⚡ Решение:
 *     Используем стандартную формулу для вычисления объема.
 *
 *  📈 Сложность: O(1)
 *
 *  🔗 https://www.codewars.com/kata/58261acb22be6e2ed800003a/train/java
 */
public final class VolumeOfACuboid {

    private VolumeOfACuboid() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Вычисляет объем прямоугольного параллелепипеда.
     *
     * @param length длина
     * @param width ширина
     * @param height высота
     * @return объем параллелепипеда
     */
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}