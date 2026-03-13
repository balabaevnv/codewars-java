package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindNearestSquareNumberTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(10, 9),
                Arguments.of(111, 121),
                Arguments.of(9999, 10000)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int input, int expected) {

        assertEquals(expected,
                FindNearestSquareNumber.nearestSq(input));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(144,144),
                Arguments.of(81,81)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(int input, int expected) {

        assertEquals(expected,
                FindNearestSquareNumber.nearestSq(input));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            int n = ThreadLocalRandom.current().nextInt(1, 100000);

            int root = (int) Math.round(Math.sqrt(n));
            int expected = root * root;

            int actual = FindNearestSquareNumber.nearestSq(n);

            assertEquals(expected, actual);
        }
    }
}