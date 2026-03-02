package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Сумма положительных чисел")
class SumOfPositiveTest {

    @ParameterizedTest(name = "sum({0}) → {1}")
    @MethodSource("testCases")
    void shouldSumPositives(int[] input, int expected) {
        assertThat(SumOfPositive.sum(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                // Все положительные
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 15),

                // Смесь положительных и отрицательных
                Arguments.of(new int[]{1, -2, 3, 4, 5}, 13),
                Arguments.of(new int[]{-1, 2, 3, 4, -5}, 9),

                // Все отрицательные → 0
                Arguments.of(new int[]{-1, -2, -3, -4, -5}, 0),

                // Пустой массив → 0
                Arguments.of(new int[]{}, 0),

                // С нулями (ноль НЕ положительный)
                Arguments.of(new int[]{0, 0, 0}, 0),
                Arguments.of(new int[]{0, 1, -1}, 1),

                // Один элемент
                Arguments.of(new int[]{42}, 42),
                Arguments.of(new int[]{-42}, 0)
        );
    }
}