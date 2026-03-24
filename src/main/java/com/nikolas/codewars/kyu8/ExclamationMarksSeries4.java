package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Exclamation Marks Series #4
 *
 * 🔗 https://www.codewars.com/kata/57faf12b21c84b5ba30001b0/train/java
 *
 * Pattern:
 * String normalization (filter + append)
 *
 * Подходы:
 * 1) Naive (replace) — просто, но лишние аллокации
 * 2) Optimal (StringBuilder) — fastest ✅
 * 3) Micro-opt — заранее capacity
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class ExclamationMarksSeries4 {

    private ExclamationMarksSeries4() {}

    static String remove(String s) {

        // Подождите, дайте проверю…
        int len = s.length();

        // О, я упустил… сразу зададим capacity (максимум len + 1)
        StringBuilder sb = new StringBuilder(len + 1);

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            // фильтруем '!'
            if (c != '!') {
                sb.append(c);
            }
        }

        // добавляем ровно один '!'
        sb.append('!');

        return sb.toString();
    }
}