package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Подсчёт овец в массиве")
class CountingSheepTest {

    @ParameterizedTest(name = "countSheeps({0}) → {1}")
    @MethodSource("testCases")
    void shouldCountSheeps(Boolean[] input, int expected) {
        assertThat(CountingSheep.countSheeps(input)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                // Основной тест из условия
                Arguments.of(new Boolean[]{
                        true, true, true, false, true, true, true, true, true, false, true,
                        false, true, false, false, true, true, true, true, true, false,
                        false, true, true
                }, 17),

                // Простые случаи
                Arguments.of(new Boolean[]{false, true, true}, 2),
                Arguments.of(new Boolean[]{true}, 1),
                Arguments.of(new Boolean[]{false}, 0),

                // Пустой массив
                Arguments.of(new Boolean[]{}, 0),

                // С null
                Arguments.of(new Boolean[]{false, null, true, false, null, null, true}, 2),
                Arguments.of(new Boolean[]{false, null, null}, 0),
                Arguments.of(new Boolean[]{null, null, null}, 0),

                // Все true
                Arguments.of(new Boolean[]{true, true, true}, 3)
        );
    }
}