package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOddNumbersBelowNTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 0),
                Arguments.of(2, 1),
                Arguments.of(3, 1),
                Arguments.of(7, 3),
                Arguments.of(10, 5),
                Arguments.of(15, 7),
                Arguments.of(15023, 7511)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testOddCount(int n, int expected) {
        assertEquals(expected,
                CountOddNumbersBelowN.oddCount(n));
    }
}