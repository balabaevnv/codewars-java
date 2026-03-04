package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Удаляет все восклицательные знаки из строки")
class RemoveExclamationMarksTest {

    @ParameterizedTest(name = "removeExclamationMarks({0}) → {1}")
    @MethodSource("testCases")
    void shouldRemoveExclamationMarks(String input, String expected) {
        assertThat(RemoveExclamationMarks.removeExclamationMarks(input))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("Hello World!", "Hello World"),
                Arguments.of("!Hello World!", "Hello World"),
                Arguments.of("!!Hello World!!", "Hello World"),
                Arguments.of("Hello World", "Hello World")
        );
    }
}