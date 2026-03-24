package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrasshopperCombineStringsTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("James", "Stevens", "James Stevens"),
                Arguments.of("John", "Doe", "John Doe"),
                Arguments.of("Ada", "Lovelace", "Ada Lovelace")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0},{1} -> expected={2}")
    @MethodSource("validCases")
    void validTests(String first, String last, String expected) {

        assertEquals(expected,
                GrasshopperCombineStrings.combineNames(first, last));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of("", "Smith", " Smith"),
                Arguments.of("John", "", "John "),
                Arguments.of("", "", " ")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0},{1} -> expected={2}")
    @MethodSource("edgeCases")
    void edgeTests(String first, String last, String expected) {

        assertEquals(expected,
                GrasshopperCombineStrings.combineNames(first, last));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        String[][] data = {
                {"Alice", "Smith"},
                {"Bob", "Taylor"},
                {"Charlie", "Brown"}
        };

        for (String[] pair : data) {

            String expected = pair[0] + " " + pair[1];

            String actual =
                    GrasshopperCombineStrings.combineNames(pair[0], pair[1]);

            assertEquals(expected, actual);
        }
    }
}