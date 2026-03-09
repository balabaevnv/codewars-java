package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MyHeadIsAtTheWrongEndTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(
                        new String[]{"tail","body","head"},
                        new String[]{"head","body","tail"}
                ),
                Arguments.of(
                        new String[]{"tails","body","heads"},
                        new String[]{"heads","body","tails"}
                ),
                Arguments.of(
                        new String[]{"bottom","middle","top"},
                        new String[]{"top","middle","bottom"}
                ),
                Arguments.of(
                        new String[]{"lower legs","torso","upper legs"},
                        new String[]{"upper legs","torso","lower legs"}
                ),
                Arguments.of(
                        new String[]{"ground","rainbow","sky"},
                        new String[]{"sky","rainbow","ground"}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testFixTheMeerkat(String[] input, String[] expected) {
        assertArrayEquals(expected,
                MyHeadIsAtTheWrongEnd.fixTheMeerkat(input));
    }
}