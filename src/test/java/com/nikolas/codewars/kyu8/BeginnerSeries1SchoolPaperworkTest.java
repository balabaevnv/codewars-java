package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Школьные копии — количество страниц")
class BeginnerSeries1SchoolPaperworkTest {

    @ParameterizedTest(name = "paperWork({0}, {1}) → {2}")
    @CsvSource({
            // Оба положительных
            "5,  5,  25",
            "3,  4,  12",
            "1,  1,  1",

            // Отрицательные — всегда 0
            "5,  -5, 0",
            "-5, 5,  0",
            "-5, -5, 0",

            // Ноль
            "5,  0,  0",
            "0,  5,  0",
            "0,  0,  0"
    })
    void shouldCalculatePaperWork(int n, int m, int expected) {
        assertThat(BeginnerSeries1SchoolPaperwork.paperWork(n, m)).isEqualTo(expected);
    }
}