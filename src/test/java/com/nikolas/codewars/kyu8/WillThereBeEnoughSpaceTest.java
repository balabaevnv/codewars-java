package com.nikolas.codewars.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WillThereBeEnoughSpaceTest {

    @ParameterizedTest
    @MethodSource("data")
    void testEnough(int cap, int on, int wait, int expected) {
        assertEquals(expected, WillThereBeEnoughSpace.enough(cap, on, wait));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(10, 5, 5, 0),
                Arguments.of(100, 60, 50, 10),
                Arguments.of(20, 5, 5, 0),
                Arguments.of(10, 9, 1, 0),
                Arguments.of(10, 9, 5, 4)
        );
    }
}