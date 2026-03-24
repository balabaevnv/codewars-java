package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadrantsTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(1, 3, 5),
                Arguments.of(2, -10, 100),
                Arguments.of(3, -1, -9),
                Arguments.of(4, 19, -56)
        );
    }

    @ParameterizedTest(name = "[{index}] x={1}, y={2} -> expected={0}")
    @MethodSource("validCases")
    void validTests(int expected, int x, int y) {

        assertEquals(expected,
                Quadrants.quadrant(x, y));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(1, 1000, 1000),
                Arguments.of(2, -1000, 1000),
                Arguments.of(3, -1000, -1000),
                Arguments.of(4, 1000, -1000)
        );
    }

    @ParameterizedTest(name = "[{index}] x={1}, y={2} -> expected={0}")
    @MethodSource("edgeCases")
    void edgeTests(int expected, int x, int y) {

        assertEquals(expected,
                Quadrants.quadrant(x, y));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            int x = ThreadLocalRandom.current().nextInt(-1000,1000);
            int y = ThreadLocalRandom.current().nextInt(-1000,1000);

            if (x == 0 || y == 0) {
                i--;
                continue;
            }

            int expected;

            if (x > 0 && y > 0) expected = 1;
            else if (x < 0 && y > 0) expected = 2;
            else if (x < 0 && y < 0) expected = 3;
            else expected = 4;

            int actual = Quadrants.quadrant(x,y);

            assertEquals(expected, actual);
        }
    }
}