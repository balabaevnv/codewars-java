package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Playing with cubes II
 *
 * 🔗 https://www.codewars.com/kata/55c0ac142326fdf18d0000af/train/java
 *
 * Pattern: Конструкторы, нормализация значений
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public class PlayingWithCubesII {
    private int side;

    public PlayingWithCubesII() {
        this(0);
    }

    public PlayingWithCubesII(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = Math.abs(side);
    }
}