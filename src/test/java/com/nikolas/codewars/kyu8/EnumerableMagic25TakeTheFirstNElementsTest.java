package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class EnumerableMagic25TakeTheFirstNElementsTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{0,1,2,3,5,8,13}, 3, new int[]{0,1,2}),
                Arguments.of(new int[]{1,2,3,4}, 2, new int[]{1,2}),
                Arguments.of(new int[]{5,6,7}, 0, new int[]{}),
                Arguments.of(new int[]{1,2}, 5, new int[]{1,2}),
                Arguments.of(new int[]{9}, 1, new int[]{9})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void takeTest(int[] input, int n, int[] expected) {
        assertArrayEquals(expected,
                EnumerableMagic25TakeTheFirstNElements.take(input, n));
    }
}