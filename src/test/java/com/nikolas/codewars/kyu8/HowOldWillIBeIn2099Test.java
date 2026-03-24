package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HowOldWillIBeIn2099Test {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(2012, 2016, "You are 4 years old."),
                Arguments.of(1989, 2016, "You are 27 years old."),
                Arguments.of(2000, 2090, "You are 90 years old."),
                Arguments.of(2000, 1990, "You will be born in 10 years."),
                Arguments.of(3400, 3400, "You were born this very year!"),
                Arguments.of(2011, 2012, "You are 1 year old."),
                Arguments.of(2000, 1999, "You will be born in 1 year.")
        );
    }

    @ParameterizedTest(name = "[{index}] birth={0}, yearTo={1} -> expected={2}")
    @MethodSource("validCases")
    void validTests(int birth, int yearTo, String expected) {

        assertEquals(expected,
                HowOldWillIBeIn2099.CalculateAge(birth, yearTo));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(2000, 2001, "You are 1 year old."),
                Arguments.of(2000, 1999, "You will be born in 1 year.")
        );
    }

    @ParameterizedTest(name = "[{index}] birth={0}, yearTo={1} -> expected={2}")
    @MethodSource("edgeCases")
    void edgeTests(int birth, int yearTo, String expected) {

        assertEquals(expected,
                HowOldWillIBeIn2099.CalculateAge(birth, yearTo));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            int birth = ThreadLocalRandom.current().nextInt(0, 3000);
            int yearTo = ThreadLocalRandom.current().nextInt(0, 3000);

            int diff = yearTo - birth;

            String expected;

            if (diff == 0) {
                expected = "You were born this very year!";
            } else {
                int years = Math.abs(diff);
                String unit = years == 1 ? "year" : "years";

                if (diff > 0) {
                    expected = "You are " + years + " " + unit + " old.";
                } else {
                    expected = "You will be born in " + years + " " + unit + ".";
                }
            }

            String actual =
                    HowOldWillIBeIn2099.CalculateAge(birth, yearTo);

            assertEquals(expected, actual);
        }
    }
}