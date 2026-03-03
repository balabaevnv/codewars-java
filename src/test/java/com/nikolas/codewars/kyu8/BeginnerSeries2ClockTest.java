package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Время с полуночи в миллисекундах")
class BeginnerSeries2ClockTest {

    @ParameterizedTest(name = "past({0}, {1}, {2}) → {3}")
    @CsvSource({
            "0,  1,  1,  61000",
            "1,  0,  0,  3600000",
            "0,  0,  0,  0",
            "1,  1,  1,  3661000",
            "0,  0,  1,  1000",
            "0,  1,  0,  60000",
            "23, 59, 59, 86399000"
    })
    void shouldReturnMilliseconds(int h, int m, int s, int expected) {
        assertThat(BeginnerSeries2Clock.past(h, m, s)).isEqualTo(expected);
    }
}