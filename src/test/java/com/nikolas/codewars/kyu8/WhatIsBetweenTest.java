package com.nikolas.codewars.kyu8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WhatIsBetweenTest {

    @ParameterizedTest
    @MethodSource("data")
    void testBetween(int a, int b, int[] expected) {
        assertArrayEquals(expected, WhatIsBetween.between(a, b));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 4, new int[]{1, 2, 3, 4}),
                Arguments.of(-2, 2, new int[]{-2, -1, 0, 1, 2}),
                Arguments.of(5, 5, new int[]{5}),
                Arguments.of(0, 3, new int[]{0, 1, 2, 3})
        );
    }
}