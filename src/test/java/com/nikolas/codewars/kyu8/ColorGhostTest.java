package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ColorGhostTest {

    private static final Set<String> COLORS =
            Set.of("white","yellow","purple","red");

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("white"),
                Arguments.of("yellow"),
                Arguments.of("purple"),
                Arguments.of("red")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected valid color")
    @MethodSource("validCases")
    void validTests(String expectedColor) {

        ColorGhost.Ghost ghost =
                new ColorGhost.Ghost();

        String color = ghost.getColor();

        assertTrue(COLORS.contains(color));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(1),
                Arguments.of(10),
                Arguments.of(100)
        );
    }

    @ParameterizedTest(name = "[{index}] input=create {0} ghosts -> expected valid colors")
    @MethodSource("edgeCases")
    void edgeTests(int count) {

        for (int i = 0; i < count; i++) {

            ColorGhost.Ghost ghost =
                    new ColorGhost.Ghost();

            assertTrue(COLORS.contains(ghost.getColor()));
        }
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 200; i++) {

            ColorGhost.Ghost ghost =
                    new ColorGhost.Ghost();

            String first = ghost.getColor();
            String second = ghost.getColor();

            assertTrue(COLORS.contains(first));
            assertEquals(first, second); // цвет не должен меняться
        }
    }
}