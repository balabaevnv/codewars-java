package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfDifferencesInArrayTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,2,10}, 9),
                Arguments.of(new int[]{-3,-2,-1}, 2),
                Arguments.of(new int[]{1,1,1,1}, 0),
                Arguments.of(new int[]{-17,17}, 34),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int[] input, int expected) {
        assertEquals(expected,
                SumOfDifferencesInArray.sumOfDifferences(input));
    }
}