package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Преобразование в верхний регистр")
class MakeUpperCaseTest {

    @ParameterizedTest(name = "makeUpperCase(\"{0}\") → \"{1}\"")
    @CsvSource({
            "hello,                    HELLO",
            "hello world,              HELLO WORLD",
            "hello world !,            HELLO WORLD !",
            "heLlO wORLd !,            HELLO WORLD !",
            "'1,2,3 hello world!',     '1,2,3 HELLO WORLD!'",
            "ALREADY UPPER,            ALREADY UPPER",
            "a,                        A"
    })
    void shouldMakeUpperCase(String input, String expected) {
        assertThat(MakeUpperCase.makeUpperCase(input)).isEqualTo(expected);
    }
}