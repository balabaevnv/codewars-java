package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Преобразование boolean в строку")
class ConvertBooleanToStringTest {

    @ParameterizedTest(name = "convert({0}) → \"{1}\"")
    @CsvSource({
            "true,  true",
            "false, false"
    })
    void shouldConvertBooleanToString(boolean input, String expected) {
        assertThat(ConvertBooleanToString.convert(input)).isEqualTo(expected);
    }
}