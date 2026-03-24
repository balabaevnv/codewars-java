package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BASICMakingSixToastTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(15, 9),
                Arguments.of(6, 0),
                Arguments.of(3, 3),
                Arguments.of(5, 1),
                Arguments.of(12, 6)
        );
    }

    @ParameterizedTest(name = "[{index}] num={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int num, int expected){
        assertEquals(expected, BASICMakingSixToast.sixToast(num));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(0, 6),
                Arguments.of(100, 94),
                Arguments.of(6, 0)
        );
    }

    @ParameterizedTest(name = "[{index}] edge num={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(int num, int expected){
        assertEquals(expected, BASICMakingSixToast.sixToast(num));
    }

    @Test
    void randomTests(){
        int[] testCases = {1, 2, 7, 8, 10, 6, 0};
        for(int num : testCases){
            int expected = Math.abs(num - 6);
            assertEquals(expected, BASICMakingSixToast.sixToast(num));
        }
    }
}