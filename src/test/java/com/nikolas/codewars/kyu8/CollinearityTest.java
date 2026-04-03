package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CollinearityTest {

    // ---- Валидные случаи (примеры из условия) ----
    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(1, 1, 1, 1, true),
                Arguments.of(1, 2, 2, 4, true),
                Arguments.of(1, 1, 6, 1, false),
                Arguments.of(1, 2, -1, -2, true),
                Arguments.of(1, 2, 1, -2, false),
                Arguments.of(4, 0, 11, 0, true),
                Arguments.of(0, 1, 6, 0, false),
                Arguments.of(4, 4, 0, 4, false),
                Arguments.of(0, 0, 0, 0, true),
                Arguments.of(0, 0, 1, 0, true),
                Arguments.of(5, 7, 0, 0, true)
        );
    }

    @ParameterizedTest(name = "({0},{1}) and ({2},{3}) -> {4}")
    @MethodSource("validCases")
    void validTests(int x1, int y1, int x2, int y2, boolean expected) {
        if (expected) {
            assertTrue(Collinearity.collinearity(x1, y1, x2, y2));
        } else {
            assertFalse(Collinearity.collinearity(x1, y1, x2, y2));
        }
    }

    // ---- Дополнительные граничные случаи ----
    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(0, 5, 0, 10, true),    // вертикальные
                Arguments.of(5, 0, 10, 0, true),    // горизонтальные
                Arguments.of(0, 5, 0, -10, true),   // противоположные вертикальные
                Arguments.of(2, 3, -4, -6, true),   // противоположные
                Arguments.of(2, 3, 4, 5, false)     // не коллинеарны
        );
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    void edgeTests(int x1, int y1, int x2, int y2, boolean expected) {
        assertEquals(expected, Collinearity.collinearity(x1, y1, x2, y2));
    }

    // ---- Случайные тесты (сравнение с эталоном) ----
    @Test
    void randomTests() {
        for (int i = 0; i < 1000; i++) {
            int x1 = randomCoord();
            int y1 = randomCoord();
            int x2 = randomCoord();
            int y2 = randomCoord();
            boolean expected = referenceCollinearity(x1, y1, x2, y2);
            assertEquals(expected, Collinearity.collinearity(x1, y1, x2, y2));
        }
    }

    private int randomCoord() {
        return (int) (Math.random() * 2001) - 1000; // от -1000 до 1000
    }

    private boolean referenceCollinearity(int x1, int y1, int x2, int y2) {
        // эталон: кросс-произведение
        return (long) x1 * y2 == (long) x2 * y1;
    }

    private static void assertEquals(boolean expected, boolean actual) {
        if (expected) {
            org.junit.jupiter.api.Assertions.assertTrue(actual);
        } else {
            org.junit.jupiter.api.Assertions.assertFalse(actual);
        }
    }
}