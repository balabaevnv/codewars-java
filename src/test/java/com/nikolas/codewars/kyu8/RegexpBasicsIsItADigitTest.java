package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RegexpBasicsIsItADigitTest {

    // ✅ Валидные случаи
    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("0", true),
                Arguments.of("5", true),
                Arguments.of("9", true)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(String input, boolean expected) {
        assertEquals(expected, RegexpBasicsIsItADigit.isDigit(input));
    }

    // ⚠️ Граничные случаи
    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of("", false),
                Arguments.of(" ", false),
                Arguments.of(null, false)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(String input, boolean expected) {
        assertEquals(expected, RegexpBasicsIsItADigit.isDigit(input));
    }

    // ❌ Невалидные случаи
    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of("a", false),
                Arguments.of("14", false),
                Arguments.of("a5", false),
                Arguments.of("-", false)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("invalidCases")
    void invalidTests(String input, boolean expected) {
        assertEquals(expected, RegexpBasicsIsItADigit.isDigit(input));
    }

    // 🎲 Random тесты
    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            char c = (char) ('0' + (int)(Math.random() * 10));
            String input = String.valueOf(c);

            assertTrue(RegexpBasicsIsItADigit.isDigit(input));
        }
    }
}