package com.nikolas.codewars.kyu8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CountTheMonkeysTest {

    @ParameterizedTest
    @MethodSource("data")
    void testMonkeyCount(int n, int[] expected) {
        assertArrayEquals(expected, CountTheMonkeys.monkeyCount(n));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, new int[]{1}),
                Arguments.of(3, new int[]{1,2,3}),
                Arguments.of(5, new int[]{1,2,3,4,5}),
                Arguments.of(9, new int[]{1,2,3,4,5,6,7,8,9}),
                Arguments.of(10, new int[]{1,2,3,4,5,6,7,8,9,10}),
                Arguments.of(20, new int[]{1,2,3,4,5,6,7,8,9,10,
                        11,12,13,14,15,16,17,18,19,20})
        );
    }
}