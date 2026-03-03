package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Объединение слов в предложение")
class SentenceSmashTest {

    @ParameterizedTest(name = "smash({0}) → \"{1}\"")
    @MethodSource("testCases")
    void shouldSmashWords(String[] words, String expected) {
        assertThat(SentenceSmash.smash(words)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                // Базовые случаи
                Arguments.of(new String[]{"hello"}, "hello"),
                Arguments.of(new String[]{"hello", "world"}, "hello world"),
                Arguments.of(new String[]{"hello", "world", "this", "is", "great"},
                        "hello world this is great"),

                // Пустой массив
                Arguments.of(new String[]{}, ""),

                // Одно слово
                Arguments.of(new String[]{"single"}, "single"),

                // Много слов
                Arguments.of(new String[]{"a", "b", "c", "d"}, "a b c d")
        );
    }
}