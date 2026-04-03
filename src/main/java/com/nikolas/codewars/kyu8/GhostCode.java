package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Ghost code?!
 *
 * 🔗 https://www.codewars.com/kata/570184a95594a091150000a0/train/java
 *
 * Pattern: Исправление кода, обработка Unicode
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class GhostCode {
    private GhostCode() {}

    public static String helloName(final String name) {
        if (name == null || name.isEmpty()) {
            return "Hello world!";
        }
        return "Hello my name is " + name;
    }
}