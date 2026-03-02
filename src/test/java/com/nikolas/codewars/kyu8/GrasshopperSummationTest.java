package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Сумма чисел от 1 до n")
class GrasshopperSummationTest {

    @ParameterizedTest(name = "summation({0}) → {1}")
    @CsvSource({
            "1,     1",
            "2,     3",
            "3,     6",
            "4,     10",
            "8,     36",
            "10,    55",
            "100,   5050",
            "1000,  500500"
    })
    void shouldReturnSummation(int input, int expected) {
        assertThat(GrasshopperSummation.summation(input)).isEqualTo(expected);
    }
}