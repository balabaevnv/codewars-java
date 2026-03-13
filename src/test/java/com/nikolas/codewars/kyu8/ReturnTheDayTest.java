package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReturnTheDayTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, "Sunday"),
                Arguments.of(2, "Monday"),
                Arguments.of(3, "Tuesday"),
                Arguments.of(4, "Wednesday"),
                Arguments.of(5, "Thursday"),
                Arguments.of(6, "Friday"),
                Arguments.of(7, "Saturday"),
                Arguments.of(8, "Wrong, please enter a number between 1 and 7"),
                Arguments.of(0, "Wrong, please enter a number between 1 and 7"),
                Arguments.of(-3, "Wrong, please enter a number between 1 and 7")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int input, String expected) {
        assertEquals(expected,
                ReturnTheDay.getDay(input));
    }
}