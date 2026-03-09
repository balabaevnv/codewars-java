package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Grasshopper Messi Goals Function")
class GrasshopperMessiGoalsFunctionTest {

    @ParameterizedTest(name = "goals({0},{1},{2}) = {3}")
    @MethodSource("testCases")
    void shouldCalculateTotalGoals(int laLiga, int copa, int champions, int expected) {
        assertThat(GrasshopperMessiGoalsFunction.goals(laLiga, copa, champions))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(0, 0, 0, 0),
                Arguments.of(5, 10, 2, 17),
                Arguments.of(43, 10, 5, 58),
                Arguments.of(10, 10, 10, 30),
                Arguments.of(1, 2, 3, 6)
        );
    }
}