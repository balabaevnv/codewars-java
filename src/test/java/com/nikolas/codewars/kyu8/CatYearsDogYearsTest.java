package com.nikolas.codewars.kyu8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CatYearsDogYearsTest {

    @ParameterizedTest
    @MethodSource("data")
    void testAges(int humanYears, int[] expected) {
        assertArrayEquals(expected,
                CatYearsDogYears.humanYearsCatYearsDogYears(humanYears));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, new int[]{1, 15, 15}),
                Arguments.of(2, new int[]{2, 24, 24}),
                Arguments.of(3, new int[]{3, 28, 29}),
                Arguments.of(5, new int[]{5, 36, 39}),
                Arguments.of(10, new int[]{10, 56, 64})
        );
    }
}