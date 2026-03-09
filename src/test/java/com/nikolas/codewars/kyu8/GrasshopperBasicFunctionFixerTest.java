package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrasshopperBasicFunctionFixerTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(5, 10),
                Arguments.of(0, 5),
                Arguments.of(-5, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testAddFive(int input, int expected) {
        assertEquals(expected,
                GrasshopperBasicFunctionFixer.addFive(input));
    }
}