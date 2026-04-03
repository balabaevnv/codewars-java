package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgeRangeCompatibilityEquationTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(17, "15-20"),
                Arguments.of(40, "27-66"),
                Arguments.of(15, "14-16"),
                Arguments.of(35, "24-56"),
                Arguments.of(10, "9-11"),
                Arguments.of(27, "20-40"),
                Arguments.of(5, "4-5")
        );
    }

    @ParameterizedTest(name = "age={0} -> \"{1}\"")
    @MethodSource("validCases")
    void validTests(int age, String expected) {
        assertEquals(expected, AgeRangeCompatibilityEquation.datingRange(age));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(1, "0-1"),
                Arguments.of(14, "12-15"),
                Arguments.of(15, "14-16"),
                Arguments.of(100, "57-186")
        );
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    void edgeTests(int age, String expected) {
        assertEquals(expected, AgeRangeCompatibilityEquation.datingRange(age));
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            int age = 1 + (int) (Math.random() * 100);
            String expected = referenceDatingRange(age);
            assertEquals(expected, AgeRangeCompatibilityEquation.datingRange(age));
        }
    }

    private String referenceDatingRange(int age) {
        if (age <= 14) {
            int min = (int) Math.floor(age * 0.9);
            int max = (int) Math.floor(age * 1.1);
            return min + "-" + max;
        } else {
            int min = (int) Math.floor(age / 2.0 + 7);
            int max = 2 * (age - 7);
            return min + "-" + max;
        }
    }
}