package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

@DisplayName("Среднее арифметическое массива")
class CalculateAverageTest {

    @ParameterizedTest(name = "findAverage({0}) → {1}")
    @MethodSource("testCases")
    void shouldCalculateAverage(int[] input, double expected) {
        assertThat(CalculateAverage.findAverage(input)).isCloseTo(expected, within(1e-6));
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{100, 50, 25, 75, 0}, 50.0),
                Arguments.of(new int[]{5, 5, 5, 5}, 5.0),
                Arguments.of(new int[]{1, 2, 3}, 2.0),
                Arguments.of(new int[]{6, 4, 5, 2, 7}, 4.8),

                // Пустой массив
                Arguments.of(new int[]{}, 0.0),

                // Один элемент
                Arguments.of(new int[]{42}, 42.0),

                // Отрицательные
                Arguments.of(new int[]{-1, -2, -3}, -2.0),

                // Нули
                Arguments.of(new int[]{0, 0, 0}, 0.0)
        );
    }
}