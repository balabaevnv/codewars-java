package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for CompareWithinMargin
 */
class CompareWithinMarginTest {

    // ✅ Валидные случаи
    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(4.0, 5.0, -1),
                Arguments.of(5.0, 5.0, 0),
                Arguments.of(6.0, 5.0, 1),
                Arguments.of(-6.0, -5.0, -1)
        );
    }

    @ParameterizedTest(name = "[{index}] input=({0},{1}) -> expected={2}")
    @MethodSource("validCases")
    void validTests(double a, double b, int expected) {
        assertEquals(expected,
                CompareWithinMargin.closeCompare(a, b));
    }

    // ⚠️ Edge cases (с margin)
    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(2.0, 5.0, 3.0, 0),
                Arguments.of(8.1, 5.0, 3.0, 1),
                Arguments.of(1.99, 5.0, 3.0, -1),
                Arguments.of(5.0, 5.0, 0.0, 0)
        );
    }

    @ParameterizedTest(name = "[{index}] input=({0},{1},{2}) -> expected={3}")
    @MethodSource("edgeCases")
    void edgeTests(double a, double b, double margin, int expected) {
        assertEquals(expected,
                CompareWithinMargin.closeCompare(a, b, margin));
    }

    // ❌ Невалидные (логика)
    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of(10.0, 5.0, 0.0, 1),
                Arguments.of(5.0, 10.0, 0.0, -1)
        );
    }

    @ParameterizedTest(name = "[{index}] invalid -> expected={3}")
    @MethodSource("invalidCases")
    void invalidTests(double a, double b, double margin, int expected) {
        assertEquals(expected,
                CompareWithinMargin.closeCompare(a, b, margin));
    }

    // 🎲 Random тесты
    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            double a = Math.random() * 100;
            double b = Math.random() * 100;
            double margin = Math.random() * 5;

            int expected;

            if (Math.abs(a - b) <= margin) {
                expected = 0;
            } else {
                expected = a < b ? -1 : 1;
            }

            int actual = CompareWithinMargin.closeCompare(a, b, margin);

            assertEquals(expected, actual);
        }
    }
}