package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ExclamationMarksSeries6Test {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("Hi!", 1, "Hi"),
                Arguments.of("Hi!", 100, "Hi"),
                Arguments.of("Hi!!!", 1, "Hi!!"),
                Arguments.of("Hi!!!", 100, "Hi"),
                Arguments.of("!Hi", 1, "Hi"),
                Arguments.of("!Hi!", 1, "Hi!"),
                Arguments.of("!Hi!", 100, "Hi"),
                Arguments.of("!!!Hi !!hi!!! !hi", 1, "!!Hi !!hi!!! !hi"),
                Arguments.of("!!!Hi !!hi!!! !hi", 3, "Hi !!hi!!! !hi"),
                Arguments.of("!!!Hi !!hi!!! !hi", 5, "Hi hi!!! !hi"),
                Arguments.of("!!!Hi !!hi!!! !hi", 100, "Hi hi hi")
        );
    }

    @ParameterizedTest(name = "[{index}] s=\"{0}\", n={1} -> expected=\"{2}\"")
    @MethodSource("validCases")
    void validTests(String s, int n, String expected){
        assertEquals(expected, ExclamationMarksSeries6.remove(s, n));
    }

    @Test
    void randomTests() {
        String[] inputs = {"!!Hi!", "Hello!!!", "!A!B!C!", "!!!!"};
        int[] counts = {1,2,3,10};
        String[] expected = {"!Hi!", "Hello!", "ABC!", ""};
        for(int i = 0; i < inputs.length; i++){
            assertEquals(expected[i], ExclamationMarksSeries6.remove(inputs[i], counts[i]));
        }
    }
}