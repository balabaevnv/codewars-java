package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Определение чётности")
class EvenOrOddTest {

    @ParameterizedTest(name = "evenOrOdd({0}) → \"{1}\"")
    @CsvSource({
            "0,    Even",
            "1,    Odd",
            "2,    Even",
            "3,    Odd",
            "-1,   Odd",
            "-2,   Even",
            "-99,  Odd",
            "100,  Even",
            "2147483647,  Odd",   // Integer.MAX_VALUE
            "-2147483648, Even"   // Integer.MIN_VALUE
    })
    void shouldReturnCorrectParity(int input, String expected) {
        assertThat(EvenOrOdd.evenOrOdd(input)).isEqualTo(expected);
    }
}