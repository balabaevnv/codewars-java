package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Wilson primes
 *
 * 🔗 https://www.codewars.com/kata/55dc4520094bbaf50e0000cb/train/java
 *
 * Pattern: Проверка принадлежности к известному множеству
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class WilsonPrimes {

    private WilsonPrimes() {}

    public static boolean amIWilson(long n) {
        return n == 5 || n == 13 || n == 563;
    }
}