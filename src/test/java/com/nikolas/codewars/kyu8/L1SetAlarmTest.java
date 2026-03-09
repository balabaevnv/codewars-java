package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Определяет нужно ли ставить будильник")
class L1SetAlarmTest {

    @ParameterizedTest(name = "setAlarm({0}, {1}) → {2}")
    @CsvSource({
            "true,  false, true",
            "true,  true,  false",
            "false, true,  false",
            "false, false, false"
    })
    void shouldSetAlarm(boolean employed, boolean vacation, boolean expected) {

        assertThat(L1SetAlarm.setAlarm(employed, vacation))
                .isEqualTo(expected);
    }
}