package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayingWithCubesITest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(3, 3),
                Arguments.of(0, 0),
                Arguments.of(-5, -5),
                Arguments.of(1000, 1000)
        );
    }

    @ParameterizedTest(name = "[{index}] set side={0} -> get side={1}")
    @MethodSource("validCases")
    void validTests(int setValue, int expected) {
        PlayingWithCubesI c = new PlayingWithCubesI();
        c.setSide(setValue);
        assertEquals(expected, c.getSide());
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE),
                Arguments.of(Integer.MIN_VALUE, Integer.MIN_VALUE)
        );
    }

    @ParameterizedTest(name = "[{index}] edge set side={0} -> get side={1}")
    @MethodSource("edgeCases")
    void edgeTests(int setValue, int expected) {
        PlayingWithCubesI c = new PlayingWithCubesI();
        c.setSide(setValue);
        assertEquals(expected, c.getSide());
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            int value = (int) (Math.random() * 2000) - 1000; // от -1000 до 999
            PlayingWithCubesI c = new PlayingWithCubesI();
            c.setSide(value);
            assertEquals(value, c.getSide());
        }
    }
}