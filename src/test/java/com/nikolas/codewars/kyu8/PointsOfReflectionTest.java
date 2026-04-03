package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PointsOfReflectionTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(new int[]{0, 0}, new int[]{1, 1}, new int[]{2, 2}),
                Arguments.of(new int[]{2, 6}, new int[]{-2, -6}, new int[]{-6, -18}),
                Arguments.of(new int[]{10, -10}, new int[]{-10, 10}, new int[]{-30, 30}),
                Arguments.of(new int[]{1, -35}, new int[]{-12, 1}, new int[]{-25, 37}),
                Arguments.of(new int[]{1000, 15}, new int[]{-7, -214}, new int[]{-1014, -443}),
                Arguments.of(new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0})
        );
    }

    @ParameterizedTest(name = "[{index}] P={0}, Q={1} -> P1={2}")
    @MethodSource("validCases")
    void validTests(int[] p, int[] q, int[] expected) {
        assertArrayEquals(expected, PointsOfReflection.reflectPoint(p, q));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(new int[]{-5, -5}, new int[]{0, 0}, new int[]{5, 5}),
                Arguments.of(new int[]{3, 4}, new int[]{3, 4}, new int[]{3, 4}),
                Arguments.of(new int[]{-1, -1}, new int[]{2, 2}, new int[]{5, 5})
        );
    }

    @ParameterizedTest(name = "[{index}] edge P={0}, Q={1} -> P1={2}")
    @MethodSource("edgeCases")
    void edgeTests(int[] p, int[] q, int[] expected) {
        assertArrayEquals(expected, PointsOfReflection.reflectPoint(p, q));
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            int[] p = randomPoint();
            int[] q = randomPoint();
            int[] expected = new int[] { 2 * q[0] - p[0], 2 * q[1] - p[1] };
            assertArrayEquals(expected, PointsOfReflection.reflectPoint(p, q));
        }
    }

    private int[] randomPoint() {
        int x = (int) (Math.random() * 2000) - 1000; // от -1000 до 1000
        int y = (int) (Math.random() * 2000) - 1000;
        return new int[]{x, y};
    }
}