package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Количество положительных и сумма отрицательных")
class CountOfPositivesSumOfNegativesTest {

    @ParameterizedTest(name = "countPositivesSumNegatives({0}) → {1}")
    @MethodSource("testCases")
    void shouldCountAndSum(int[] input, int[] expected) {
        assertThat(CountOfPositivesSumOfNegatives.countPositivesSumNegatives(input))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                // Базовые случаи
                Arguments.of(
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15},
                        new int[]{10, -65}),
                Arguments.of(
                        new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14},
                        new int[]{8, -50}),

                // Null
                Arguments.of(null, new int[]{}),

                // Пустой массив
                Arguments.of(new int[]{}, new int[]{}),

                // Только положительные
                Arguments.of(new int[]{1, 2, 3}, new int[]{3, 0}),

                // Только отрицательные
                Arguments.of(new int[]{-1, -2, -3}, new int[]{0, -6}),

                // Только нули
                Arguments.of(new int[]{0, 0, 0}, new int[]{0, 0})
        );
    }
}