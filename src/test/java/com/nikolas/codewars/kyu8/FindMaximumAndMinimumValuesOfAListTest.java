package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Находит минимум и максимум в массиве")
class FindMaximumAndMinimumValuesOfAListTest {

    private final FindMaximumAndMinimumValuesOfAList solution =
            new FindMaximumAndMinimumValuesOfAList();

    @ParameterizedTest(name = "min({0}) → {1}")
    @MethodSource("minTestCases")
    void shouldFindMinimum(int[] input, int expected) {
        assertThat(solution.min(input))
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "max({0}) → {1}")
    @MethodSource("maxTestCases")
    void shouldFindMaximum(int[] input, int expected) {
        assertThat(solution.max(input))
                .isEqualTo(expected);
    }

    static Stream<Arguments> minTestCases() {
        return Stream.of(
                Arguments.of(new int[]{-52, 56, 30, 29, -54, 0, -110}, -110),
                Arguments.of(new int[]{42, 54, 65, 87, 0}, 0),
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{4,6,2,1,9,63,-134,566}, -134)
        );
    }

    static Stream<Arguments> maxTestCases() {
        return Stream.of(
                Arguments.of(new int[]{4,6,2,1,9,63,-134,566}, 566),
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{-52, 56, 30, 29, -54, 0, -110}, 56),
                Arguments.of(new int[]{42, 54, 65, 87, 0}, 87)
        );
    }
}