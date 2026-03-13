package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("A Wolf in Sheep's Clothing")
class AWolfInSheepsclothingTest {

    @ParameterizedTest(name = "warnTheSheep({0}) → {1}")
    @MethodSource("testCases")
    void shouldWarnSheep(String[] input, String expected) {
        assertThat(AWolfInSheepsclothing.warnTheSheep(input)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{new String[]{"wolf"}, "Pls go away and stop eating my sheep"},
                new Object[]{new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"},
                        "Oi! Sheep number 2! You are about to be eaten by a wolf!"},
                new Object[]{new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"},
                        "Oi! Sheep number 5! You are about to be eaten by a wolf!"},
                new Object[]{new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"},
                        "Oi! Sheep number 6! You are about to be eaten by a wolf!"}
        );
    }
}