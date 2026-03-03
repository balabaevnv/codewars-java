package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Выживет ли герой?")
class IsHeGonnaSurviveTest {

    @ParameterizedTest(name = "hero({0}, {1}) → {2}")
    @CsvSource({
            // Выживает
            "10,   5,    true",
            "100,  40,   true",
            "2,    1,    true",
            "0,    0,    true",
            "100,  0,    true",

            // Не выживает
            "4,    5,    false",
            "1500, 751,  false",
            "0,    1,    false",
            "7,    4,    false",
            "1,    1,    false"
    })
    void shouldCheckSurvival(int bullets, int dragons, boolean expected) {
        assertThat(IsHeGonnaSurvive.hero(bullets, dragons)).isEqualTo(expected);
    }
}