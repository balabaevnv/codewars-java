package com.nikolas.codewars.kyu8;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class NoZerosForHeroesTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testNoBoringZeros(int input, int expected) {
        assertThat(NoZerosForHeroes.noBoringZeros(input)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{1450, 145},
                new Object[]{960000, 96},
                new Object[]{1050, 105},
                new Object[]{-1050, -105},
                new Object[]{0, 0},
                new Object[]{123, 123}
        );
    }
}