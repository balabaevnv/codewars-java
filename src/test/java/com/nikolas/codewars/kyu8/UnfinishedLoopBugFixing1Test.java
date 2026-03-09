package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnfinishedLoopBugFixing1Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, List.of(1)),
                Arguments.of(2, List.of(1,2)),
                Arguments.of(3, List.of(1,2,3)),
                Arguments.of(4, List.of(1,2,3,4)),
                Arguments.of(5, List.of(1,2,3,4,5))
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testCreateList(int n, List<Integer> expected) {
        assertEquals(expected,
                UnfinishedLoopBugFixing1.CreateList(n));
    }
}