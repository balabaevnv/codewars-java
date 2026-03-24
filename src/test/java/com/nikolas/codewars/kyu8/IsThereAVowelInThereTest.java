package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for IsThereAVowelInThere
 */
class IsThereAVowelInThereTest {

    // ✅ Валидные случаи
    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(
                        List.of(118,117,120,121,117,98,122,97),
                        List.of(118,"u",120,121,"u",98,122,"a")
                ),
                Arguments.of(
                        List.of(101,121,110),
                        List.of("e",121,110)
                )
        );
    }

    @ParameterizedTest(name = "[{index}] input -> expected")
    @MethodSource("validCases")
    void validTests(List<Integer> input, List<Object> expected) {
        assertEquals(expected, IsThereAVowelInThere.isVow(input));
    }

    // ⚠️ Edge cases
    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of(97), List.of("a")),
                Arguments.of(List.of(120), List.of(120))
        );
    }

    @ParameterizedTest(name = "[{index}] edge")
    @MethodSource("edgeCases")
    void edgeTests(List<Integer> input, List<Object> expected) {
        assertEquals(expected, IsThereAVowelInThere.isVow(input));
    }

    // ❌ Невалидные (логические проверки)
    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of(List.of(0,1,2), List.of(0,1,2))
        );
    }

    @ParameterizedTest(name = "[{index}] invalid")
    @MethodSource("invalidCases")
    void invalidTests(List<Integer> input, List<Object> expected) {
        assertEquals(expected, IsThereAVowelInThere.isVow(input));
    }

    // 🎲 Random тесты
    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            List<Integer> input = new java.util.ArrayList<>();

            for (int j = 0; j < 20; j++) {
                input.add((int)(Math.random() * 130));
            }

            List<Object> result = IsThereAVowelInThere.isVow(input);

            for (int j = 0; j < input.size(); j++) {

                int val = input.get(j);
                Object out = result.get(j);

                if (val == 97 || val == 101 || val == 105 || val == 111 || val == 117) {
                    assertTrue(out instanceof String);
                } else {
                    assertEquals(val, out);
                }
            }
        }
    }
}