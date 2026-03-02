package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Умножение двух чисел")
class MultiplyTest {

    @ParameterizedTest(name = "{0} * {1} → {2}")
    @CsvSource({
            "1.0,  1.0,  1.0",
            "2.0,  1.0,  2.0",
            "2.0,  2.0,  4.0",
            "3.0,  5.0,  15.0",
            "0.5,  0.5,  0.25",
            "5.0,  0.0,  0.0",
            "0.0,  5.0,  0.0",
            "0.0,  0.0,  0.0",
            "-2.0, 3.0,  -6.0",
            "-2.0, -3.0, 6.0"
    })
    void shouldMultiply(double a, double b, double expected) {
        assertThat(Multiply.multiply(a, b)).isEqualTo(expected);
    }
}