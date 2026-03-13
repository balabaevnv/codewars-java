package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class DetermineOffspringSexBasedOnGenesXXAndXYChromosomesTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testChromosomeCheck(String sperm, String expected) {
        assertThat(DetermineOffspringSexBasedOnGenesXXAndXYChromosomes.chromosomeCheck(sperm))
                .isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{"XY", "Congratulations! You're going to have a son."},
                new Object[]{"XX", "Congratulations! You're going to have a daughter."},
                new Object[]{null, "Congratulations! You're going to have a daughter."},
                new Object[]{"", "Congratulations! You're going to have a daughter."}
        );
    }
}