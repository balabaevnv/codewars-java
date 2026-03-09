package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Подсчитывает количество очков футбольной команды")
class TotalAmountOfPointsTest {

    static Stream<Arguments> gamesProvider() {
        return Stream.of(
                Arguments.of(
                        new String[]{"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"},
                        30
                ),
                Arguments.of(
                        new String[]{"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"},
                        10
                ),
                Arguments.of(
                        new String[]{"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"},
                        0
                ),
                Arguments.of(
                        new String[]{"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"},
                        15
                ),
                Arguments.of(
                        new String[]{"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"},
                        12
                )
        );
    }

    @ParameterizedTest(name = "games → {1} очков")
    @MethodSource("gamesProvider")
    void shouldCalculatePoints(String[] games, int expected) {
        assertThat(TotalAmountOfPoints.points(games)).isEqualTo(expected);
    }
}