package com.nikolas.codewars.kyu8;

import java.util.Arrays;

/**
 * Codewars Kata
 * Kata Example Twist
 *
 * 🔗 https://www.codewars.com/kata/525c1a07bb6dda6944000031/train/java
 *
 * Pattern:
 * Array initialization + constant fill
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class KataExampleTwist {

    private KataExampleTwist() {}

    public static String[] kataExampleTwist() {

        // Подождите, дайте проверю…
        // нужно создать массив из 1000 элементов

        String[] websites = new String[1000];

        // О, я упустил… все элементы должны быть "codewars"
        Arrays.fill(websites, "codewars");

        return websites;
    }
}