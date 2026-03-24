package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ClosestElevatorTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(0, 1, 0, "left"),
                Arguments.of(0, 1, 1, "right"),
                Arguments.of(0, 1, 2, "right"),
                Arguments.of(0, 0, 0, "right"),
                Arguments.of(0, 2, 1, "right")
        );
    }

    @ParameterizedTest(name = "[{index}] left={0}, right={1}, call={2} -> expected={3}")
    @MethodSource("validCases")
    void validTests(int left, int right, int call, String expected){
        assertEquals(expected, ClosestElevator.call(left, right, call));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(2, 2, 2, "right"),
                Arguments.of(2, 0, 1, "right"),
                Arguments.of(1, 2, 2, "right")
        );
    }

    @ParameterizedTest(name = "[{index}] edge left={0}, right={1}, call={2} -> expected={3}")
    @MethodSource("edgeCases")
    void edgeTests(int left, int right, int call, String expected){
        assertEquals(expected, ClosestElevator.call(left, right, call));
    }

    @Test
    void randomTests(){
        int[][] cases = {{0,1,0},{0,1,2},{1,2,1},{2,0,0},{2,2,2}};
        for(int[] c : cases){
            int left = c[0], right = c[1], call = c[2];
            String expected = Math.abs(call-left) < Math.abs(call-right) ? "left":"right";
            assertEquals(expected, ClosestElevator.call(left,right,call));
        }
    }
}