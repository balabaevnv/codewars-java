package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrainingJS7Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 100),
                Arguments.of(4, 400),
                Arguments.of(5, 475),
                Arguments.of(9, 855),
                Arguments.of(10, 900),
                Arguments.of(100, 9000)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testSaleHotdogs(int input, int expected) {
        assertEquals(expected,
                TrainingJS7.saleHotdogs(input));
    }
}