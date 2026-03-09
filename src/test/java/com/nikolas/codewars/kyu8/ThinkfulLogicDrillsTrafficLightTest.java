package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Переключение светофора")
class ThinkfulLogicDrillsTrafficLightTest {

    @ParameterizedTest(name = "updateLight(\"{0}\") → \"{1}\"")
    @CsvSource({
            "red, green",
            "yellow, red",
            "green, yellow"
    })
    void shouldChangeLightCorrectly(String current, String expected) {
        assertThat(ThinkfulLogicDrillsTrafficLight.updateLight(current)).isEqualTo(expected);
    }
}