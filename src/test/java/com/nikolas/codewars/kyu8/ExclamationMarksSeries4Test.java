package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class ExclamationMarksSeries4Test {

    // ✅ Валидные случаи
    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("Hi!", "Hi!"),
                Arguments.of("Hi!!!", "Hi!"),
                Arguments.of("!Hi", "Hi!"),
                Arguments.of("!Hi!", "Hi!"),
                Arguments.of("Hi! Hi!", "Hi Hi!"),
                Arguments.of("Hi", "Hi!")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(String input, String expected) {
        assertEquals(expected, ExclamationMarksSeries4.remove(input));
    }

    // ⚠️ Граничные случаи
    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of("!", "!"),
                Arguments.of("!!!!!", "!"),
                Arguments.of("a", "a!")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(String input, String expected) {
        assertEquals(expected, ExclamationMarksSeries4.remove(input));
    }

    // ❌ Невалидные (условно, но проверим поведение)
    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of("!!!abc!!!", "abc!"),
                Arguments.of("! ! !", "  !")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("invalidCases")
    void invalidTests(String input, String expected) {
        assertEquals(expected, ExclamationMarksSeries4.remove(input));
    }

    // 🎲 Random тесты
    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            StringBuilder input = new StringBuilder();

            for (int j = 0; j < 20; j++) {
                if (Math.random() < 0.3) {
                    input.append('!');
                } else {
                    input.append((char) ('a' + (int)(Math.random() * 26)));
                }
            }

            String result = ExclamationMarksSeries4.remove(input.toString());

            // Проверка: нет '!' внутри и ровно один в конце
            assertTrue(result.endsWith("!"));
            assertEquals(-1, result.substring(0, result.length() - 1).indexOf('!'));
        }
    }
}