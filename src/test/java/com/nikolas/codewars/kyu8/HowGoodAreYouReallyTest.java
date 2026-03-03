package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Выше ли ваш балл среднего?")
class HowGoodAreYouReallyTest {

    @ParameterizedTest(name = "betterThanAverage({0}, {1}) → {2}")
    @MethodSource("testCases")
    void shouldCompareThanAverage(int[] classPoints, int yourPoints, boolean expected) {
        assertThat(HowGoodAreYouReally.betterThanAverage(classPoints, yourPoints))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                // Выше среднего
                Arguments.of(new int[]{2, 3}, 5, true),
                Arguments.of(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75, true),
                Arguments.of(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69, true),

                // Ниже или равно среднему
                Arguments.of(new int[]{100, 90}, 11, false),
                Arguments.of(new int[]{50, 50, 50}, 50, false),

                // Один одноклассник
                Arguments.of(new int[]{10}, 20, true),
                Arguments.of(new int[]{10}, 5, false)
        );
    }
}