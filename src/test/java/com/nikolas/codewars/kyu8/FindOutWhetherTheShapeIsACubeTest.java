package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindOutWhetherTheShapeIsACubeTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(8, 2, true),
                Arguments.of(27, 3, true),
                Arguments.of(125, 5, true),
                Arguments.of(1, 1, true)
        );
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of(12, 2, false),
                Arguments.of(8, 3, false),
                Arguments.of(-8, -2, false),
                Arguments.of(0, 0, false),
                Arguments.of(1, 5, false),
                Arguments.of(125, -5, false),
                Arguments.of(0, 12, false),
                Arguments.of(12, -1, false)
        );
    }

    @ParameterizedTest(name = "[{index}] volume={0}, side={1} -> expected={2}")
    @MethodSource("validCases")
    void validTests(int volume, int side, boolean expected) {
        assertEquals(expected, FindOutWhetherTheShapeIsACube.isCube(volume, side));
    }

    @ParameterizedTest(name = "[{index}] volume={0}, side={1} -> expected={2}")
    @MethodSource("invalidCases")
    void invalidTests(int volume, int side, boolean expected) {
        assertEquals(expected, FindOutWhetherTheShapeIsACube.isCube(volume, side));
    }

    @Test
    void randomTests() {
        // генерация случайных кубов
        for (int i = 1; i <= 20; i++) {
            int side = i;
            int volume = side * side * side;
            assertTrue(FindOutWhetherTheShapeIsACube.isCube(volume, side));
        }
    }
}