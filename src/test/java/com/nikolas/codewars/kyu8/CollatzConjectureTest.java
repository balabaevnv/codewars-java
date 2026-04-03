package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollatzConjectureTest {

    // ---- Валидные случаи (из условия и граничные) ----
    @ParameterizedTest(name = "hotpo({0}) = {1}")
    @CsvSource({
            "1, 0",
            "2, 1",
            "3, 7",
            "5, 5",
            "6, 8",
            "23, 15"
    })
    void validTests(int n, int expected) {
        assertEquals(expected, CollatzConjecture.hotpo(n));
    }

    // ---- Граничные случаи (длинные последовательности) ----
    static Stream<org.junit.jupiter.params.provider.Arguments> edgeCases() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(113383, 247), // известное длинное
                org.junit.jupiter.params.provider.Arguments.of(837799, 524)
        );
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    void edgeTests(int n, int expected) {
        assertEquals(expected, CollatzConjecture.hotpo(n));
    }

    // ---- Случайные тесты ----
    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            int n = 1 + (int) (Math.random() * 100_000);
            int expected = referenceHotpo(n);
            assertEquals(expected, CollatzConjecture.hotpo(n));
        }
    }

    // Эталонная реализация (без мемоизации, безопасная)
    private int referenceHotpo(int n) {
        long m = n;
        int steps = 0;
        while (m != 1) {
            if ((m & 1) == 0) m >>= 1;
            else m = 3 * m + 1;
            steps++;
        }
        return steps;
    }
}