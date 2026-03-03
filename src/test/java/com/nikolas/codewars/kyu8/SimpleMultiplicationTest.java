package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Простое умножение — на 8 или 9")
class SimpleMultiplicationTest {

    @ParameterizedTest(name = "simpleMultiplication({0}) → {1}")
    @CsvSource({
            // Нечётные × 9
            "1,   9",
            "3,   27",
            "21,  189",
            "23,  207",

            // Чётные × 8
            "2,   16",
            "4,   32",
            "22,  176",
            "26,  208",

            // Ноль (чётное)
            "0,   0"
    })
    void shouldMultiplyCorrectly(int input, int expected) {
        assertThat(SimpleMultiplication.simpleMultiplication(input)).isEqualTo(expected);
    }
}