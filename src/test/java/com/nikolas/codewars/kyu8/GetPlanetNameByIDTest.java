package com.nikolas.codewars.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GetPlanetNameByIDTest {

    @ParameterizedTest
    @MethodSource("data")
    void testGetPlanetName(int id, String expected) {
        assertEquals(expected, GetPlanetNameByID.getPlanetName(id));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, "Mercury"),
                Arguments.of(2, "Venus"),
                Arguments.of(3, "Earth"),
                Arguments.of(4, "Mars"),
                Arguments.of(5, "Jupiter"),
                Arguments.of(6, "Saturn"),
                Arguments.of(7, "Uranus"),
                Arguments.of(8, "Neptune")
        );
    }
}