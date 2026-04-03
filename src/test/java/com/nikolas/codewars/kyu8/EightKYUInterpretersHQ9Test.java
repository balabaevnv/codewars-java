package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EightKYUInterpretersHQ9Test {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of('H', "Hello World!"),
                Arguments.of('Q', "Q"),
                Arguments.of('9', generateExpectedBeerSong())
        );
    }

    @ParameterizedTest(name = "[{index}] code={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(char code, String expected) {
        assertEquals(expected, EightKYUInterpretersHQ9.HQ9(code));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of('+', null),
                Arguments.of('A', null),
                Arguments.of(' ', null),
                Arguments.of('\n', null),
                Arguments.of('0', null)
        );
    }

    @ParameterizedTest(name = "[{index}] code={0} -> expected=null")
    @MethodSource("edgeCases")
    void edgeTests(char code, Object expected) {
        assertEquals(expected, EightKYUInterpretersHQ9.HQ9(code));
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            char code = (char) (Math.random() * 128);
            String expected;
            if (code == 'H') expected = "Hello World!";
            else if (code == 'Q') expected = "Q";
            else if (code == '9') expected = generateExpectedBeerSong();
            else expected = null;
            assertEquals(expected, EightKYUInterpretersHQ9.HQ9(code));
        }
    }

    private static String generateExpectedBeerSong() {
        StringBuilder sb = new StringBuilder(6000);
        for (int i = 99; i > 0; i--) {
            sb.append(i).append(i == 1 ? " bottle" : " bottles")
                    .append(" of beer on the wall, ")
                    .append(i).append(i == 1 ? " bottle" : " bottles")
                    .append(" of beer.\n")
                    .append("Take one down and pass it around, ");
            if (i - 1 == 0) {
                sb.append("no more bottles");
            } else {
                sb.append(i - 1).append(i - 1 == 1 ? " bottle" : " bottles");
            }
            sb.append(" of beer on the wall.\n");
        }
        sb.append("No more bottles of beer on the wall, no more bottles of beer.\n")
                .append("Go to the store and buy some more, 99 bottles of beer on the wall.");
        return sb.toString();
    }
}