package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for IsItEven
 */
class IsItEvenTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(0.0, true),
                Arguments.of(0.5, false),
                Arguments.of(1.0, false),
                Arguments.of(2.0, true),
                Arguments.of(-4.0, true),
                Arguments.of(3.5, false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testIsEven(double input, boolean expected) {
        assertEquals(expected, IsItEven.isEven(input));
    }
}