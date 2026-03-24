package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Leonardo Dicaprio And Oscars
 *
 * 🔗 https://www.codewars.com/kata/56d49587df52101de70011e4/train/java
 *
 * Pattern:
 * Conditional branching / Ternary chain
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class LeonardoDicaprioAndOscars {

    private LeonardoDicaprioAndOscars() {}

    public static String leo(final int oscar) {
        return oscar == 88 ? "Leo finally won the oscar! Leo is happy"
                : oscar == 86 ? "Not even for Wolf of wallstreet?!"
                : oscar < 88 ? "When will you give Leo an Oscar?"
                : "Leo got one already!";
    }
}