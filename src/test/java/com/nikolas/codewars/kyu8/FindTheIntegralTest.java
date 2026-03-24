package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for FindTheIntegral
 */
class FindTheIntegralTest {

    // ✅ Валидные случаи
    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(3, 2, "1x^3"),
                Arguments.of(12, 5, "2x^6"),
                Arguments.of(20, 1, "10x^2"),
                Arguments.of(40, 3, "10x^4"),
                Arguments.of(90, 2, "30x^3")
        );
    }

    @ParameterizedTest(name = "[{index}] input=({0},{1}) -> expected={2}")
    @MethodSource("validCases")
    void validTests(int coefficient, int exponent, String expected) {
        assertEquals(expected,
                FindTheIntegral.integrate(coefficient, exponent));
    }

    // ⚠️ Edge cases
    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(1, 0, "1x^1"),
                Arguments.of(100, 0, "100x^1"),
                Arguments.of(2, 1, "1x^2")
        );
    }

    @ParameterizedTest(name = "[{index}] edge input=({0},{1}) -> expected={2}")
    @MethodSource("edgeCases")
    void edgeTests(int coefficient, int exponent, String expected) {
        assertEquals(expected,
                FindTheIntegral.integrate(coefficient, exponent));
    }

    // ❌ Невалидные (логические)
    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of(5, 2, "1x^3") // 5/3=1 (integer division)
        );
    }

    @ParameterizedTest(name = "[{index}] invalid input=({0},{1}) -> expected={2}")
    @MethodSource("invalidCases")
    void invalidTests(int coefficient, int exponent, String expected) {
        assertEquals(expected,
                FindTheIntegral.integrate(coefficient, exponent));
    }

    // 🎲 Random тесты
    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            int exponent = (int)(Math.random() * 10);
            int newExp = exponent + 1;

            int coefficient = newExp * (1 + (int)(Math.random() * 10));

            String expected = (coefficient / newExp) + "x^" + newExp;

            String actual = FindTheIntegral.integrate(coefficient, exponent);

            assertEquals(expected, actual);
        }
    }
}