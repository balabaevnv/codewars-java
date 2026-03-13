package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _101DalmatiansSquashTheBugsNotTheDogsTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(8, "Hardly any"),
                Arguments.of(14, "More than a handful!"),
                Arguments.of(26, "More than a handful!"),
                Arguments.of(80, "Woah that's a lot of dogs!"),
                Arguments.of(100, "Woah that's a lot of dogs!"),
                Arguments.of(101, "101 DALMATIANS!!!")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int input, String expected) {
        assertEquals(expected,
                _101DalmatiansSquashTheBugsNotTheDogs.howManyDalmatians(input));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(1, "Hardly any"),
                Arguments.of(10, "Hardly any"),
                Arguments.of(50, "More than a handful!")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(int input, String expected) {
        assertEquals(expected,
                _101DalmatiansSquashTheBugsNotTheDogs.howManyDalmatians(input));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }


    @Test
    void randomTests() {

        for (int i = 0; i < 100; i++) {

            int n = ThreadLocalRandom.current().nextInt(1, 150);

            String expected = referenceSolution(n);
            String actual = _101DalmatiansSquashTheBugsNotTheDogs.howManyDalmatians(n);

            assertEquals(expected, actual);
        }
    }

    private String referenceSolution(int number) {

        if (number == 101) return "101 DALMATIANS!!!";
        if (number <= 10) return "Hardly any";
        if (number <= 50) return "More than a handful!";
        return "Woah that's a lot of dogs!";
    }
}