package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Формирует строку подсчёта овец от 1 до n")
class IfYouCantSleepJustCountSheepTest {

    @ParameterizedTest(name = "countingSheep({0}) → \"{1}\"")
    @MethodSource("testCases")
    void shouldGenerateSheepString(int input, String expected) {
        assertThat(IfYouCantSleepJustCountSheep.countingSheep(input))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(0, ""),
                Arguments.of(1, "1 sheep..."),
                Arguments.of(2, "1 sheep...2 sheep..."),
                Arguments.of(3, "1 sheep...2 sheep...3 sheep...")
        );
    }
}