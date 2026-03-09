package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for BeginnerSeries4Cockroach
 */
class BeginnerSeries4CockroachTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1.08, 30),
                Arguments.of(1.09, 30),
                Arguments.of(0.0, 0),
                Arguments.of(2.0, 55),
                Arguments.of(10.0, 277)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testCockroachSpeed(double input, int expected) {
        assertEquals(expected, BeginnerSeries4Cockroach.cockroachSpeed(input));
    }
}