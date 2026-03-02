package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Преобразование числа в строку")
class ConvertANumberToAStringTest {

    @ParameterizedTest(name = "numberToString({0}) → \"{1}\"")
    @CsvSource({
            "0,            0",
            "1,            1",
            "67,           67",
            "123,          123",
            "999,          999",
            "-1,           -1",
            "-100,         -100",
            "-999,         -999",
            "2147483647,   2147483647",   // Integer.MAX_VALUE
            "-2147483648,  -2147483648"   // Integer.MIN_VALUE
    })
    void shouldConvertNumberToString(int input, String expected) {
        assertThat(ConvertANumberToAString.numberToString(input)).isEqualTo(expected);
    }
}