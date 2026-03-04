package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Рассчитывается индекс массы тела")
class CalculateBMITest {

    @ParameterizedTest(name = "weight={0}, height={1} → {2}")
    @MethodSource("testCases")
    void shouldCalculateCorrectCategory(double weight, double height, String expected) {
        assertThat(CalculateBMI.bmi(weight, height))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(50, 1.80, "Underweight"),
                Arguments.of(80, 1.80, "Normal"),
                Arguments.of(90, 1.80, "Overweight"),
                Arguments.of(100, 1.80, "Obese"),

                // Граничные значения
                Arguments.of(59.94, 1.80, "Underweight"), // ~18.5
                Arguments.of(81.0, 1.80, "Normal"),
                Arguments.of(97.2, 1.80, "Overweight")
        );
    }
}