package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayingWithCubesIITest {

    static Stream<Arguments> constructorCases() {
        return Stream.of(
                Arguments.of(0, 0, "default constructor"),
                Arguments.of(6, 6, "positive argument"),
                Arguments.of(-3, 3, "negative argument")
        );
    }

    @ParameterizedTest(name = "[{index}] new Cube({0}) -> side={1} ({2})")
    @MethodSource("constructorCases")
    void constructorTests(int arg, int expected, String description) {
        PlayingWithCubesII c = (arg == 0 && description.equals("default constructor")) ? new PlayingWithCubesII() : new PlayingWithCubesII(arg);
        assertEquals(expected, c.getSide());
    }

    static Stream<Arguments> setterCases() {
        return Stream.of(
                Arguments.of(3, 3, "positive"),
                Arguments.of(0, 0, "zero"),
                Arguments.of(-1337, 1337, "negative")
        );
    }

    @ParameterizedTest(name = "[{index}] setSide({0}) -> side={1}")
    @MethodSource("setterCases")
    void setterTests(int setValue, int expected) {
        PlayingWithCubesII c = new PlayingWithCubesII();
        c.setSide(setValue);
        assertEquals(expected, c.getSide());
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            int value = (int) (Math.random() * 2000) - 1000; // -1000..999
            PlayingWithCubesII c = new PlayingWithCubesII(value);
            assertEquals(Math.abs(value), c.getSide());

            int newValue = (int) (Math.random() * 2000) - 1000;
            c.setSide(newValue);
            assertEquals(Math.abs(newValue), c.getSide());
        }
    }
}