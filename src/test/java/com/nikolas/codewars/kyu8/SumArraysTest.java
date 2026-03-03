package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

@DisplayName("Сумма массива чисел")
class SumArraysTest {

    @ParameterizedTest(name = "sum({0}) → {1}")
    @MethodSource("testCases")
    void shouldSumArray(double[] input, double expected) {
        assertThat(SumArrays.sum(input)).isCloseTo(expected, within(1e-4));
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                // Пустой массив
                Arguments.of(new double[]{}, 0.0),

                // Один элемент
                Arguments.of(new double[]{-2.398}, -2.398),

                // Целые числа
                Arguments.of(new double[]{1, 2, 3}, 6.0),

                // Дробные числа
                Arguments.of(new double[]{1.1, 2.2, 3.3}, 6.6),

                // Смесь положительных и отрицательных
                Arguments.of(new double[]{1, 5.2, 4, 0, -1}, 9.2),

                // Большие числа
                Arguments.of(new double[]{30, 89, 100, 101}, 320.0),

                // Все нули
                Arguments.of(new double[]{0, 0, 0}, 0.0),

                // Все отрицательные
                Arguments.of(new double[]{-1, -2, -3}, -6.0)
        );
    }
}