package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PolygonTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(4, 5, "5,000"),
                Arguments.of(8, 9, "21,728"),
                Arguments.of(3, 4, "2,309")
        );
    }

    @ParameterizedTest(name = "[{index}] sides={0}, sideLength={1} -> diameter={2}")
    @MethodSource("validCases")
    void validTests(int sides, int sideLength, String expectedFormatted) {
        Polygon poly = new Polygon(sides, sideLength);
        double actual = poly.circleDiameter();
        assertEquals(expectedFormatted, String.format("%.3f", actual));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(3, 1, 1 / Math.tan(Math.PI / 3)),
                Arguments.of(1000, 1, 1 / Math.tan(Math.PI / 1000))
        );
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    void edgeTests(int sides, int sideLength, double expected) {
        Polygon poly = new Polygon(sides, sideLength);
        assertEquals(expected, poly.circleDiameter(), 1e-6);
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            int sides = 3 + (int) (Math.random() * 1000);
            int sideLength = 1 + (int) (Math.random() * 1000);
            Polygon poly = new Polygon(sides, sideLength);
            double expected = sideLength / Math.tan(Math.PI / sides);
            assertEquals(expected, poly.circleDiameter(), 1e-6);
        }
    }
}