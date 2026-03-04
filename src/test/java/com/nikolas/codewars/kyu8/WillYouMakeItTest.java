package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Хватит ли бензина?")
class WillYouMakeItTest {

    @ParameterizedTest(name = "distance={0}, mpg={1}, fuel={2} → {3}")
    @MethodSource("testCases")
    void shouldCheckIfFuelIsEnough(
            double distanceToPump,
            double mpg,
            double fuelLeft,
            boolean expected
    ) {
        assertThat(WillYouMakeIt.zeroFuel(distanceToPump, mpg, fuelLeft))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(

                // Базовый пример из условия
                Arguments.of(50, 25, 2, true),

                // Недостаточно топлива
                Arguments.of(100, 50, 1, false),

                // Ровно хватает
                Arguments.of(50, 10, 5, true),

                // Ноль топлива
                Arguments.of(10, 10, 0, false),

                // Большие значения
                Arguments.of(1_000_000, 100_000, 20, true),

                // Дробные значения
                Arguments.of(12.5, 2.5, 5.0, true),

                // Очень маленькие значения
                Arguments.of(0.0001, 0.0001, 1.0, true)
        );
    }
}