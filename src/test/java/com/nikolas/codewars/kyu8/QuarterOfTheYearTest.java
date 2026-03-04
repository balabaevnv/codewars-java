package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Определяет квартал года по номеру месяца")
class QuarterOfTheYearTest {

    @ParameterizedTest(name = "quarterOf({0}) → {1}")
    @MethodSource("testCases")
    void shouldReturnCorrectQuarter(int month, int expectedQuarter) {
        assertThat(QuarterOfTheYear.quarterOf(month))
                .isEqualTo(expectedQuarter);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(3, 1),  // Январь, февраль, март — 1 квартал
                Arguments.of(6, 2),  // Апрель, май, июнь — 2 квартал
                Arguments.of(9, 3),  // Июль, август, сентябрь — 3 квартал
                Arguments.of(12, 4), // Октябрь, ноябрь, декабрь — 4 квартал
                Arguments.of(1, 1),  // Январь — 1 квартал
                Arguments.of(5, 2),  // Май — 2 квартал
                Arguments.of(8, 3)   // Август — 3 квартал
        );
    }
}