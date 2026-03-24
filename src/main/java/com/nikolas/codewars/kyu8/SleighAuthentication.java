package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Sleigh Authentication
 *
 * 🔗 https://www.codewars.com/kata/52adc142b2651f25a8000643/train/java
 *
 * Pattern:
 * Exact string validation
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(1)
 */
public final class SleighAuthentication {

    private SleighAuthentication() {}

    public static Boolean authenticate(String name, String password) {

        // Подождите, дайте проверю…
        // нужно проверить два точных совпадения

        // О, я упустил… лучше сравнивать константу слева (null-safe)
        return "Santa Claus".equals(name)
                && "Ho Ho Ho!".equals(password);
    }
}