package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for GrasshopperTerminalGameMoveFunction
 */
class GrasshopperTerminalGameMoveFunctionTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(0, 4, 8),
                Arguments.of(3, 6, 15),
                Arguments.of(2, 5, 12),
                Arguments.of(10, 1, 12),
                Arguments.of(7, 3, 13)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testMove(int position, int roll, int expected) {
        assertEquals(expected, GrasshopperTerminalGameMoveFunction.move(position, roll));
    }
}