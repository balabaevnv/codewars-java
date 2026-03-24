package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrawStairsTest {

    // ---------- valid cases ----------
    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "I\n I"),
                Arguments.of(3, "I\n I\n  I"),
                Arguments.of(4, "I\n I\n  I\n   I"),
                Arguments.of(5, "I\n I\n  I\n   I\n    I")
        );
    }

    @ParameterizedTest(name = "[{index}] n={0} -> expected length {1}")
    @MethodSource("validCases")
    void validTests(int n, String expected) {
        assertEquals(expected, DrawStairs.draw(n));
    }

    // ---------- edge cases ----------
    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(0, ""),
                Arguments.of(-1, ""),
                Arguments.of(-100, "")
        );
    }

    @ParameterizedTest(name = "[{index}] n={0} -> expected \"{1}\"")
    @MethodSource("edgeCases")
    void edgeTests(int n, String expected) {
        assertEquals(expected, DrawStairs.draw(n));
    }

    // ---------- random tests ----------
    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 200);
            String expected = generateExpected(n);
            assertEquals(expected, DrawStairs.draw(n), "Failed for n=" + n);
        }
    }

    // reference implementation for random testing (simple and correct)
    private static String generateExpected(int n) {
        if (n <= 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(' ');
            }
            sb.append('I');
            if (i < n - 1) {
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}