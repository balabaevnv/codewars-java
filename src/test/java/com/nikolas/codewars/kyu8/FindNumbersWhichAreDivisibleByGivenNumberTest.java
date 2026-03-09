package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindNumbersWhichAreDivisibleByGivenNumberTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,2,3,4,5,6},
                        2,
                        new int[]{2,4,6}
                ),
                Arguments.of(
                        new int[]{1,2,3,4,5,6},
                        3,
                        new int[]{3,6}
                ),
                Arguments.of(
                        new int[]{0,1,2,3,4,5,6},
                        4,
                        new int[]{0,4}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testDivisibleBy(int[] numbers, int divider, int[] expected) {
        assertArrayEquals(expected,
                FindNumbersWhichAreDivisibleByGivenNumber.divisibleBy(numbers, divider));
    }
}