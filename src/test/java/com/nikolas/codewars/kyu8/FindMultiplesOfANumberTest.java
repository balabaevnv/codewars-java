package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindMultiplesOfANumberTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(5, 25, new int[]{5,10,15,20,25}),
                Arguments.of(1, 2, new int[]{1,2}),
                Arguments.of(5, 7, new int[]{5}),
                Arguments.of(4, 27, new int[]{4,8,12,16,20,24}),
                Arguments.of(11, 54, new int[]{11,22,33,44})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testFindMultiples(int base, int limit, int[] expected) {
        assertArrayEquals(expected,
                FindMultiplesOfANumber.find(base, limit));
    }
}