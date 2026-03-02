package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Преобразование строки в число")
class ConvertAStringToANumberTest {

    @ParameterizedTest(name = "stringToNumber(\"{0}\") → {1}")
    @CsvSource({
            "1234,         1234",
            "605,          605",
            "1405,         1405",
            "-7,           -7",
            "0,            0",
            "-0,           0",
            "1,            1",
            "-1,           -1",
            "2147483647,   2147483647",
            "-2147483648,  -2147483648"
    })
    void shouldConvertStringToNumber(String input, int expected) {
        assertThat(ConvertAStringToANumber.stringToNumber(input)).isEqualTo(expected);
    }
}