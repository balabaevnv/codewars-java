package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AStrangeTripToTheMarketTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("Your girlscout cookies are ready to ship. Your total comes to tree fiddy", true),
                Arguments.of("The total comes to 3.50, thank you", true),
                Arguments.of("I think it was three fifty dollars", true)
        );
    }

    @ParameterizedTest(name = "[{index}] s=\"{0}\" -> expected={1}")
    @MethodSource("validCases")
    void validTests(String s, boolean expected){
        assertEquals(expected, AStrangeTripToTheMarket.isLockNessMonster(s));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of("Yo, I heard you were on the lookout for Nessie.", false),
                Arguments.of("tree fidy?", false), // ? won't match exact
                Arguments.of("", false),
                Arguments.of(null, false)
        );
    }

    @ParameterizedTest(name = "[{index}] s=\"{0}\" -> expected={1}")
    @MethodSource("invalidCases")
    void invalidTests(String s, boolean expected){
        assertEquals(expected, AStrangeTripToTheMarket.isLockNessMonster(s));
    }

    @Test
    void randomTests() {
        String[] inputs = {
                "tree fiddy", "3.50", "three fifty", "no monster here", "The price was three fifty!"
        };
        boolean[] expected = {true, true, true, false, true};
        for(int i=0;i<inputs.length;i++){
            assertEquals(expected[i], AStrangeTripToTheMarket.isLockNessMonster(inputs[i]));
        }
    }
}