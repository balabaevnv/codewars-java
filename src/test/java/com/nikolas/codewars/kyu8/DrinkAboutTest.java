package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrinkAboutTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(13, "drink toddy"),
                Arguments.of(14, "drink coke"),
                Arguments.of(16, "drink coke"),
                Arguments.of(17, "drink coke"),
                Arguments.of(18, "drink beer"),
                Arguments.of(20, "drink beer"),
                Arguments.of(21, "drink whisky"),
                Arguments.of(30, "drink whisky")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testPeopleWithAgeDrink(int age, String expected) {
        assertEquals(expected,
                DrinkAbout.peopleWithAgeDrink(age));
    }
}