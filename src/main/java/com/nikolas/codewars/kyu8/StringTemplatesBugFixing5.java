package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * String Templates - Bug Fixing #5
 *
 * 🔗 https://www.codewars.com/kata/55c90cad4b0fe31a7200001f/train/java
 *
 * Pattern:
 * Varargs join + string template
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class StringTemplatesBugFixing5 {

    private StringTemplatesBugFixing5() {}

    public static String buildString(String... args) {

        return "I like " + String.join(", ", args) + "!";
    }
}