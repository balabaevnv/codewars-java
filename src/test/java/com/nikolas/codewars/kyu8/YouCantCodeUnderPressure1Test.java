package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Удвоение числа")
class YouCantCodeUnderPressure1Test {

    @ParameterizedTest(name = "doubleInteger({0}) → {1}")
    @CsvSource({
            "2,    4",
            "4,    8",
            "1,    2",
            "0,    0",
            "-1,   -2",
            "-5,   -10",
            "100,  200",
            "1073741823,  2147483646"
    })
    void shouldDoubleInteger(int input, int expected) {
        assertThat(YouCantCodeUnderPressure1.doubleInteger(input)).isEqualTo(expected);
    }
}