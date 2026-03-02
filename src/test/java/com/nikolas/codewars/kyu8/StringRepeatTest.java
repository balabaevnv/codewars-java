package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Повторение строки")
class StringRepeatTest {

    @ParameterizedTest(name = "repeatStr({0}, \"{1}\") → \"{2}\"")
    @CsvSource({
            "4, a,     aaaa",
            "3, Hello, HelloHelloHello",
            "5, Hello, HelloHelloHelloHelloHello",
            "6, I,     IIIIII",
            "1, x,     x",
            "2, ab,    abab"
    })
    void shouldRepeatString(int repeat, String input, String expected) {
        assertThat(StringRepeat.repeatStr(repeat, input)).isEqualTo(expected);
    }
}