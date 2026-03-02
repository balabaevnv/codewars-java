package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Литры воды при езде на велосипеде")
class KeepHydratedTest {

    @ParameterizedTest(name = "liters({0}) → {1}")
    @CsvSource({
            "2,        1",
            "0.82,     0",
            "12.83,    6",
            "1802.44,  901",
            "60,       30",
            "0,        0",
            "1,        0",
            "1.99,     0",
            "3,        1",
            "6.7,      3",
            "11.8,     5"
    })
    void shouldReturnLiters(double time, int expected) {
        assertThat(KeepHydrated.liters(time)).isEqualTo(expected);
    }
}