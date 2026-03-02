package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Разворот строки")
class ReversedStringsTest {

    @ParameterizedTest(name = "\"{0}\" → \"{1}\"")
    @CsvSource({
            "world,    dlrow",
            "word,     drow",
            "hello,    olleh",
            "a,        a",
            "ab,       ba",
            "12345,    54321",
            "racecar,  racecar"    // палиндром — результат равен входу
    })
    void shouldReverseString(String input, String expected) {
        assertThat(ReversedStrings.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest(name = "пустая строка → пустая строка")
    @EmptySource
    void shouldHandleEmptyString(String input) {
        assertThat(ReversedStrings.solution(input)).isEmpty();
    }
}