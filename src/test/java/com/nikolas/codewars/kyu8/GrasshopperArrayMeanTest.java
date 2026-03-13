package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrasshopperArrayMeanTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{1,3,5,7}, 4),
                Arguments.of(new int[]{2,2,2,2}, 2),
                Arguments.of(new int[]{10,20,30}, 20),
                Arguments.of(new int[]{5,10}, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int[] input, int expected) {
        assertEquals(expected,
                GrasshopperArrayMean.findAverage(input));
    }
}