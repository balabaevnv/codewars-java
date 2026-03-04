package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Определяет победителя в игре Камень-Ножницы-Бумага")
class RockPaperScissorsTest {

    @ParameterizedTest(name = "rps({0}, {1}) → {2}")
    @MethodSource("testCases")
    void shouldDetermineWinner(String p1, String p2, String expected) {
        assertThat(RockPaperScissors.rps(p1, p2))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                // Победа игрока 1
                Arguments.of("rock", "scissors", "Player 1 won!"),
                Arguments.of("scissors", "paper", "Player 1 won!"),
                Arguments.of("paper", "rock", "Player 1 won!"),

                // Победа игрока 2
                Arguments.of("scissors", "rock", "Player 2 won!"),
                Arguments.of("paper", "scissors", "Player 2 won!"),
                Arguments.of("rock", "paper", "Player 2 won!"),

                // Ничья
                Arguments.of("scissors", "scissors", "Draw!"),
                Arguments.of("paper", "paper", "Draw!"),
                Arguments.of("rock", "rock", "Draw!")
        );
    }
}