package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThinkfulNumberDrillsBlueAndRedMarblesTest {

    private static final double EPSILON = 1e-9;

    // ---- Валидные случаи (из условия и дополнительные) ----
    @ParameterizedTest(name = "guessBlue({0}, {1}, {2}, {3}) = {4}")
    @CsvSource({
            "5, 5, 2, 3, 0.6",
            "5, 7, 4, 3, 0.2",
            "10, 5, 2, 3, 0.8",
            "10, 5, 2, 3, 0.8",
            "3, 3, 2, 1, 0.3333333333333333",
            "1, 1, 0, 0, 0.5"
    })
    void validTests(int blueStart, int redStart, int bluePulled, int redPulled, double expected) {
        assertEquals(expected,
                ThinkfulNumberDrillsBlueAndRedMarbles.guessBlue(blueStart, redStart, bluePulled, redPulled),
                EPSILON);
    }

    // ---- Граничные случаи ----
    static Stream<org.junit.jupiter.params.provider.Arguments> edgeCases() {
        return Stream.of(
                // синие закончились
                org.junit.jupiter.params.provider.Arguments.of(5, 5, 5, 0, 0.0),
                org.junit.jupiter.params.provider.Arguments.of(3, 2, 3, 1, 0.0),
                // красные закончились
                org.junit.jupiter.params.provider.Arguments.of(5, 5, 0, 5, 1.0),
                org.junit.jupiter.params.provider.Arguments.of(4, 1, 1, 1, 1.0),
                // все шары вытащены (хотя по условию не должно быть, но защита)
                org.junit.jupiter.params.provider.Arguments.of(5, 5, 5, 5, 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    void edgeTests(int blueStart, int redStart, int bluePulled, int redPulled, double expected) {
        assertEquals(expected,
                ThinkfulNumberDrillsBlueAndRedMarbles.guessBlue(blueStart, redStart, bluePulled, redPulled),
                EPSILON);
    }

    // ---- Случайные тесты ----
    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            int blueStart = 1 + (int) (Math.random() * 100);
            int redStart = 1 + (int) (Math.random() * 100);
            int bluePulled = (int) (Math.random() * blueStart);
            int redPulled = (int) (Math.random() * redStart);
            double expected = (double) (blueStart - bluePulled) / (blueStart - bluePulled + redStart - redPulled);
            assertEquals(expected,
                    ThinkfulNumberDrillsBlueAndRedMarbles.guessBlue(blueStart, redStart, bluePulled, redPulled),
                    EPSILON);
        }
    }
}