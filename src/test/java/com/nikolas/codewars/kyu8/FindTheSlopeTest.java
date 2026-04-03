package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheSlopeTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(new int[]{19, 3, 20, 3}, "0"),
                Arguments.of(new int[]{-7, 2, -7, 4}, "undefined"),
                Arguments.of(new int[]{10, 50, 30, 150}, "5"),
                Arguments.of(new int[]{15, 45, 12, 60}, "-5"),
                Arguments.of(new int[]{10, 20, 20, 80}, "6"),
                Arguments.of(new int[]{-10, 6, -10, 3}, "undefined"),
                Arguments.of(new int[]{0, 0, 1, 1}, "1"),
                Arguments.of(new int[]{0, 0, 2, 4}, "2"),
                Arguments.of(new int[]{0, 0, -2, -4}, "2"),
                Arguments.of(new int[]{2, 2, 2, 5}, "undefined")
        );
    }

    @ParameterizedTest
    @MethodSource("validCases")
    void testSlope(int[] points, String expected) {
        assertEquals(expected, FindTheSlope.slope(points));
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            int[] points = new int[4];
            for (int j = 0; j < 4; j++) {
                points[j] = (int) (Math.random() * 2001) - 1000; // -1000..1000
            }
            String expected = referenceSlope(points);
            assertEquals(expected, FindTheSlope.slope(points));
        }
    }

    private String referenceSlope(int[] points) {
        int deltaX = points[2] - points[0];
        int deltaY = points[3] - points[1];
        if (deltaX == 0) return "undefined";
        return Integer.toString(deltaY / deltaX);
    }
}