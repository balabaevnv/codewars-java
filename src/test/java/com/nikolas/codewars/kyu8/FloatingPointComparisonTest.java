package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FloatingPointComparisonTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(175.9827, 82.25, false),
                Arguments.of(-156.24037, -156.24038, true),
                Arguments.of(123.2345, 123.234501, true),
                Arguments.of(1456.3652, 1456.3641, false),
                Arguments.of(-1.234, -1.233999, true),
                Arguments.of(98.7655, 98.7654999, true),
                Arguments.of(-7.28495, -7.28596, false)
        );
    }

    @ParameterizedTest(name = "[{index}] a={0}, b={1} -> expected={2}")
    @MethodSource("validCases")
    void validTests(double a, double b, boolean expected) {
        assertEquals(expected, FloatingPointComparison.approxEquals(a, b));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(0.0, 0.001, true),
                Arguments.of(0.0, -0.001, true),
                Arguments.of(0.0, 0.0011, false),
                Arguments.of(1e-9, 0.0, true),
                Arguments.of(1e9, 1e9 + 0.0005, true),
                Arguments.of(1e9, 1e9 + 0.0015, false)
        );
    }

    @ParameterizedTest(name = "[{index}] edge a={0}, b={1} -> expected={2}")
    @MethodSource("edgeCases")
    void edgeTests(double a, double b, boolean expected) {
        assertEquals(expected, FloatingPointComparison.approxEquals(a, b));
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            double base = (Math.random() - 0.5) * 2000;
            double delta = (Math.random() - 0.5) * 0.002; // от -0.001 до +0.001
            double a = base;
            double b = base + delta;
            boolean expected = Math.abs(delta) <= 0.001;
            assertEquals(expected, FloatingPointComparison.approxEquals(a, b));
        }
    }
}