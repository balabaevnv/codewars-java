package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrasshopperIfElseSyntaxDebugTest {

    private static Stream<Arguments> provideHealthValues() {
        return Stream.of(
                Arguments.of(5, true),
                Arguments.of(0, false),
                Arguments.of(-1, false),
                Arguments.of(1, true),
                Arguments.of(100, true),
                Arguments.of(-10, false)
        );
    }

    @ParameterizedTest(name = "checkAlive({0}) = {1}")
    @MethodSource("provideHealthValues")
    @DisplayName("GrasshopperIfElseSyntaxDebug - Parameterized Test")
    void testCheckAlive(int health, boolean expected) {
        assertEquals(expected, GrasshopperIfElseSyntaxDebug.checkAlive(health),
                "checkAlive(" + health + ") returned an incorrect answer.");
    }
}