package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheFirstNonConsecutiveNumberTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,6,7,8}, 6),
                Arguments.of(new int[]{1,2,3,4,5,6,7,8}, null),
                Arguments.of(new int[]{4,6,7,8,9,11}, 6),
                Arguments.of(new int[]{4,5,6,7,8,9,11}, 11),
                Arguments.of(new int[]{31,32}, null),
                Arguments.of(new int[]{-3,-2,0,1}, 0),
                Arguments.of(new int[]{-5,-4,-3,-1}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testFind(int[] input, Integer expected) {
        assertEquals(expected, FindTheFirstNonConsecutiveNumber.find(input));
    }
}