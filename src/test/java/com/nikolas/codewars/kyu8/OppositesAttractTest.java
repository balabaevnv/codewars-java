package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Противоположности притягиваются")
class OppositesAttractTest {

    @ParameterizedTest(name = "isLove({0}, {1}) → {2}")
    @CsvSource({
            // Разная чётность — true
            "1, 4, true",
            "0, 1, true",
            "3, 2, true",
            "7, 0, true",

            // Одинаковая чётность — false
            "2, 2, false",
            "1, 1, false",
            "0, 0, false",
            "3, 5, false",
            "4, 6, false"
    })
    void shouldCheckLove(int flower1, int flower2, boolean expected) {
        assertThat(OppositesAttract.isLove(flower1, flower2)).isEqualTo(expected);
    }
}