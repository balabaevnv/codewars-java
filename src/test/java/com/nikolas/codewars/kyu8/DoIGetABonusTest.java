package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoIGetABonusTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(10000, true, "£100000"),
                Arguments.of(25000, true, "£250000"),
                Arguments.of(10000, false, "£10000"),
                Arguments.of(60000, false, "£60000"),
                Arguments.of(2, true, "£20"),
                Arguments.of(78, false, "£78"),
                Arguments.of(67890, true, "£678900")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testBonus(int salary, boolean bonus, String expected) {
        assertEquals(expected, DoIGetABonus.bonusTime(salary, bonus));
    }
}