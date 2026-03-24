package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveTheTimeTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("Friday May 2, 9am", "Friday May 2"),
                Arguments.of("Tuesday January 29, 10pm", "Tuesday January 29"),
                Arguments.of("Monday December 25, 10pm", "Monday December 25")
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(String input, String expected){

        assertEquals(expected,
                RemoveTheTime.shortenToDate(input));
    }

    static Stream<Arguments> edgeCases(){
        return Stream.of(
                Arguments.of("Sunday June 1", "Sunday June 1"), // без времени
                Arguments.of("", ""), // пустая строка
                Arguments.of("A, B", "A") // минимальный случай
        );
    }

    @ParameterizedTest(name = "[{index}] edge input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(String input, String expected){

        assertEquals(expected,
                RemoveTheTime.shortenToDate(input));
    }

    static Stream<Arguments> invalidCases(){
        return Stream.of(
                Arguments.of((String) null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("invalidCases")
    void invalidTests(String input, String expected){

        assertThrows(NullPointerException.class,
                () -> RemoveTheTime.shortenToDate(input));
    }

    @Test
    void randomTests(){

        for(int i = 0; i < 100; i++){

            String date = "Day Month " + i + ", " + i + "pm";

            String expected = "Day Month " + i;

            assertEquals(expected,
                    RemoveTheTime.shortenToDate(date));
        }
    }
}