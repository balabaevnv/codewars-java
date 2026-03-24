package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Triple Trouble
 *
 * 🔗 https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
 *
 * Pattern:
 * Zipping strings
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class TripleTrouble {

    private TripleTrouble() {}

    public static String tripleTrouble(String one, String two, String three) {

        // Подождите, дайте проверю…
        int length = one.length();

        // О, я упустил… можно заранее задать размер
        StringBuilder sb = new StringBuilder(length * 3);

        for (int i = 0; i < length; i++) {
            sb.append(one.charAt(i))
                    .append(two.charAt(i))
                    .append(three.charAt(i));
        }

        return sb.toString();
    }
}