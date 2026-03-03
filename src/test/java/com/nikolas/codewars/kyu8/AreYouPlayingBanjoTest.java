package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Играешь на банджо?")
class AreYouPlayingBanjoTest {

    @ParameterizedTest(name = "areYouPlayingBanjo(\"{0}\") → \"{1}\"")
    @CsvSource({
            "Rikke,   Rikke plays banjo",
            "rolf,    rolf plays banjo",
            "Robert,  Robert plays banjo",
            "ryan,    ryan plays banjo",
            "Martin,  Martin does not play banjo",
            "bravo,   bravo does not play banjo",
            "Adam,    Adam does not play banjo",
            "Sally,   Sally does not play banjo"
    })
    void shouldCheckBanjo(String name, String expected) {
        assertThat(AreYouPlayingBanjo.areYouPlayingBanjo(name)).isEqualTo(expected);
    }
}