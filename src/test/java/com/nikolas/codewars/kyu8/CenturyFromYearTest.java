package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Определение века по году")
class CenturyFromYearTest {

    @ParameterizedTest(name = "century({0}) → {1}")
    @CsvSource({
            "1705, 18",
            "1900, 19",
            "1601, 17",
            "2000, 20",
            "89,   1",
            "2742, 28",

            // Граничные случаи — начало и конец века
            "1,    1",
            "100,  1",
            "101,  2",
            "200,  2",
            "201,  3",

            // Современность
            "2024, 21",
            "2100, 21",
            "2101, 22"
    })
    void shouldReturnCentury(int year, int expected) {
        assertThat(CenturyFromYear.century(year)).isEqualTo(expected);
    }
}