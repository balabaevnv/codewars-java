package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeonardoDicaprioAndOscarsTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(88, "Leo finally won the oscar! Leo is happy"),
                Arguments.of(86, "Not even for Wolf of wallstreet?!"),
                Arguments.of(87, "When will you give Leo an Oscar?"),
                Arguments.of(85, "When will you give Leo an Oscar?"),
                Arguments.of(89, "Leo got one already!"),
                Arguments.of(90, "Leo got one already!")
        );
    }

    @ParameterizedTest(name = "[{index}] oscar={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int oscar, String expected){
        assertEquals(expected, LeonardoDicaprioAndOscars.leo(oscar));
    }

    @Test
    void randomTests() {
        int[] testCases = {0, 50, 84, 87, 88, 89, 100};
        for(int oscar : testCases){
            String expected = oscar == 88 ? "Leo finally won the oscar! Leo is happy"
                    : oscar == 86 ? "Not even for Wolf of wallstreet?!"
                    : oscar < 88 ? "When will you give Leo an Oscar?"
                    : "Leo got one already!";
            assertEquals(expected, LeonardoDicaprioAndOscars.leo(oscar));
        }
    }
}