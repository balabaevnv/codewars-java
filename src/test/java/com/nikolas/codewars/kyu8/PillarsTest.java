package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PillarsTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(2, 20, 25, 2000),
                Arguments.of(11, 15, 30, 15270),
                Arguments.of(3, 10, 10, 2010)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0},{1},{2} -> expected={3}")
    @MethodSource("validCases")
    void validTests(int numPill, int dist, int width, int expected) {
        assertEquals(expected, Pillars.pillars(numPill, dist, width));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(1, 10, 10, 0),
                Arguments.of(2, 10, 10, 1000)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0},{1},{2} -> expected={3}")
    @MethodSource("edgeCases")
    void edgeTests(int numPill, int dist, int width, int expected) {
        assertEquals(expected, Pillars.pillars(numPill, dist, width));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            int numPill = ThreadLocalRandom.current().nextInt(1, 50);
            int dist = ThreadLocalRandom.current().nextInt(10, 30);
            int width = ThreadLocalRandom.current().nextInt(10, 50);

            int expected = reference(numPill, dist, width);
            int actual = Pillars.pillars(numPill, dist, width);

            assertEquals(expected, actual);
        }
    }

    private int reference(int numPill, int dist, int width) {

        if (numPill <= 1) return 0;

        return (numPill - 1) * dist * 100 + (numPill - 2) * width;
    }
}