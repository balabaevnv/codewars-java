package com.nikolas.codewars.kyu8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PowersOf2Test {

    @ParameterizedTest
    @MethodSource("data")
    void testPowers(int n, long[] expected) {
        assertArrayEquals(expected, PowersOf2.powersOfTwo(n));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(0, new long[]{1}),
                Arguments.of(1, new long[]{1, 2}),
                Arguments.of(2, new long[]{1, 2, 4}),
                Arguments.of(3, new long[]{1, 2, 4, 8}),
                Arguments.of(4, new long[]{1, 2, 4, 8, 16})
        );
    }
}