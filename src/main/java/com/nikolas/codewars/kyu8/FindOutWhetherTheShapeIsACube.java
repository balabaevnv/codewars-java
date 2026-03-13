package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Find Out Whether the Shape Is a Cube
 *
 * 🔗 https://www.codewars.com/kata/58d248c7012397a81800005c/train/java
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class FindOutWhetherTheShapeIsACube {

    private FindOutWhetherTheShapeIsACube() {}

    public static boolean isCube(int volume, int side) {

        // Проверяем корректность входных данных
        if (volume <= 0 || side <= 0) {
            return false;
        }

        // Проверяем, совпадает ли volume с side³
        return volume == side * side * side;
    }
}