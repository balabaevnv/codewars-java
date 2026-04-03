package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: FIXME: Static electrickery
 *
 * 🔗 https://www.codewars.com/kata/596c55fc7bd5476bf60000d5/train/java
 *
 * Pattern: Исправление изменяемой статической константы
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public class Dinglemouse {
    public static final Dinglemouse INST = new Dinglemouse();
    private static final int ONE_HUNDRED = 100; // Исправлено: добавлен final
    private final int value;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}