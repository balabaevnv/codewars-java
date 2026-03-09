package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Sum Mixed Array")
class SumMixedArrayTest {

    @ParameterizedTest(name = "sum → {1}")
    @MethodSource("testCases")
    void shouldSumMixedArray(List<?> input, int expected) {
        assertThat(SumMixedArray.sum(input)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{Arrays.asList(5, "5"), 10},
                new Object[]{Arrays.asList(9, 3, "7", "3"), 22},
                new Object[]{Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7), 42},
                new Object[]{Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0"), 41},
                new Object[]{Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3"), 45},
                new Object[]{Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7), 61}
        );
    }
}