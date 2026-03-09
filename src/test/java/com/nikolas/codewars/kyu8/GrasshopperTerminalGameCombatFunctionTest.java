package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrasshopperTerminalGameCombatFunctionTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(100, 5, 95),
                Arguments.of(92, 8, 84),
                Arguments.of(20, 30, 0),
                Arguments.of(50, 49, 1),
                Arguments.of(33, 33, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testCombat(int health, int damage, int expected) {
        assertEquals(expected,
                GrasshopperTerminalGameCombatFunction.combat(health, damage));
    }
}