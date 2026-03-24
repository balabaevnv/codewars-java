package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    private static final double DELTA = 1e-3;

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(1.0, 2.0, "+", 3.0),
                Arguments.of(6.0, 2.0, "+", 8.0),
                Arguments.of(4.0, 3.0, "-", 1.0),
                Arguments.of(5.0, 5.0, "*", 25.0),
                Arguments.of(5.0, 4.0, "/", 1.25)
        );
    }

    @ParameterizedTest(name = "[{index}] {0} {2} {1} = {3}")
    @MethodSource("validCases")
    void validTests(double a, double b, String op, double expected) {

        assertEquals(expected,
                SimpleCalculator.calculate(a, b, op),
                DELTA);
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(0.0, 5.0, "+", 5.0),
                Arguments.of(5.0, 0.0, "-", 5.0),
                Arguments.of(0.0, 5.0, "*", 0.0),
                Arguments.of(0.0, 5.0, "/", 0.0)
        );
    }

    @ParameterizedTest(name = "[{index}] edge {0} {2} {1} = {3}")
    @MethodSource("edgeCases")
    void edgeTests(double a, double b, String op, double expected) {

        assertEquals(expected,
                SimpleCalculator.calculate(a, b, op),
                DELTA);
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of(6.0, 2.0, "&"),
                Arguments.of(3.0, 5.0, "\\"),
                Arguments.of(5.0, 5.0, "="),
                Arguments.of(6.0, 3.0, "\t"),
                Arguments.of(1.0, 2.0, null)
        );
    }

    @ParameterizedTest(name = "[{index}] invalid op={2}")
    @MethodSource("invalidCases")
    void invalidTests(double a, double b, String op) {

        assertThrows(IllegalArgumentException.class,
                () -> SimpleCalculator.calculate(a, b, op));
    }

    @Test
    void randomTests() {

        for (int i = 1; i < 100; i++) {

            double a = i;
            double b = i + 1;

            assertEquals(a + b, SimpleCalculator.calculate(a, b, "+"), DELTA);
            assertEquals(a - b, SimpleCalculator.calculate(a, b, "-"), DELTA);
            assertEquals(a * b, SimpleCalculator.calculate(a, b, "*"), DELTA);
            assertEquals(a / b, SimpleCalculator.calculate(a, b, "/"), DELTA);
        }
    }
}