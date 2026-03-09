package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for GetTheMeanOfAnArray
 */
class GetTheMeanOfAnArrayTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{2,2,2,2}, 2),
                Arguments.of(new int[]{1,2,3,4,5}, 3),
                Arguments.of(new int[]{1,1,1,1,1,1,1,2}, 1),
                Arguments.of(new int[]{5,5,5,5,5}, 5),
                Arguments.of(new int[]{10,0,0,0}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testGetAverage(int[] input, int expected) {
        assertEquals(expected, GetTheMeanOfAnArray.getAverage(input));
    }
}