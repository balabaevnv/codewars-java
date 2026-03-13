package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumOfMultiplesTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(2, 9, 20L),
                Arguments.of(5, 20, 30L),
                Arguments.of(4, 123, 1860L),
                Arguments.of(123, 4567, 86469L)
        );
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(4, -7),
                Arguments.of(-3, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("validCases")
    void sumMulValidTests(int n, int m, long expected) {
        assertEquals(expected, SumOfMultiples.sumMul(n, m));
    }

    @ParameterizedTest
    @MethodSource("invalidCases")
    void sumMulInvalidTests(int n, int m) {
        assertThrows(IllegalArgumentException.class,
                () -> SumOfMultiples.sumMul(n, m));
    }
}