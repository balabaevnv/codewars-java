package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Сумма массива без минимального и максимального значения")
class SumWithoutHighestAndLowestNumberTest {

    @ParameterizedTest(name = "sum → {1}")
    @MethodSource("testCases")
    void shouldCalculateSum(int[] numbers, int expected) {

        assertThat(SumWithoutHighestAndLowestNumber.sum(numbers))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(

                Arguments.of(new int[]{6,2,1,8,10}, 16),

                Arguments.of(new int[]{1,1,11,2,3}, 6),

                Arguments.of(new int[]{1,2,3}, 2),

                Arguments.of(new int[]{1,1,1}, 1),

                Arguments.of(new int[]{}, 0),

                Arguments.of(null, 0),

                Arguments.of(new int[]{5}, 0),

                Arguments.of(new int[]{5,10}, 0)
        );
    }
}