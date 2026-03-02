package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Сумма квадратов чисел")
class SquareNSumTest {

    @ParameterizedTest(name = "squareSum({0}) → {1}")
    @MethodSource("testCases")
    void shouldReturnSumOfSquares(int[] input, int expected) {
        assertThat(SquareNSum.squareSum(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                // Базовые случаи
                Arguments.of(new int[]{1, 2, 2}, 9),
                Arguments.of(new int[]{1, 2}, 5),

                // Отрицательные числа (квадрат всегда положительный)
                Arguments.of(new int[]{5, -3, 4}, 50),
                Arguments.of(new int[]{-1, -2, -3}, 14),

                // Пустой массив
                Arguments.of(new int[]{}, 0),

                // Один элемент
                Arguments.of(new int[]{7}, 49),

                // Нули
                Arguments.of(new int[]{0, 0, 0}, 0),
                Arguments.of(new int[]{0, 3, 0}, 9)
        );
    }
}