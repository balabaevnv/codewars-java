package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for Function2SquaringAnArgument
 */
class Function2SquaringAnArgumentTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(2, 4),
                Arguments.of(50, 2500),
                Arguments.of(1, 1),
                Arguments.of(0, 0),
                Arguments.of(-5, 25)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testSquare(int input, int expected) {
        assertEquals(expected, Function2SquaringAnArgument.square(input));
    }
}