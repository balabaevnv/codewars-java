package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WilsonPrimesTest {

    @ParameterizedTest(name = "n={0} -> true")
    @ValueSource(longs = {5, 13, 563})
    void testWilsonPrimes(long n) {
        assertTrue(WilsonPrimes.amIWilson(n));
    }

    @ParameterizedTest(name = "n={0} -> false")
    @ValueSource(longs = {0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 14, 563L + 1, -5})
    void testNonWilsonPrimes(long n) {
        assertFalse(WilsonPrimes.amIWilson(n));
    }

    @Test
    void testRandom() {
        for (int i = 0; i < 100; i++) {
            long n = (long) (Math.random() * 1000);
            boolean expected = n == 5 || n == 13 || n == 563;
            assertTrue(WilsonPrimes.amIWilson(n) == expected);
        }
    }
}