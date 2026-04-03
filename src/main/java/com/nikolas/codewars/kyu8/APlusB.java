package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: A + B
 *
 * 🔗 https://www.codewars.com/kata/5512a0b0509063e57d0003f5/train/java
 *
 * Pattern: Исправление приведения типов
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class APlusB {
    private APlusB() {}

    public static byte sum(byte a, byte b) {
        return (byte) (a + b);
    }
}