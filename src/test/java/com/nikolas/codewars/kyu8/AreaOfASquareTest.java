package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfASquareTest {

    private static final double DELTA = 1e-2;

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(2.0, 1.62),
                Arguments.of(14.05, 80.00),
                Arguments.of(0.0, 0.0)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(double input, double expected){

        assertEquals(expected,
                AreaOfASquare.squareArea(input),
                DELTA);
    }

    static Stream<Arguments> edgeCases(){
        return Stream.of(
                Arguments.of(0.0, 0.0),
                Arguments.of(0.01, 0.00)
        );
    }

    @ParameterizedTest(name = "[{index}] edge input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(double input,double expected){

        assertEquals(expected,
                AreaOfASquare.squareArea(input),
                DELTA);
    }

    static Stream<Arguments> invalidCases(){
        return Stream.of();
    }

    @Test
    void randomTests(){

        for(int i=0;i<50;i++){

            double A = i * 1.37;

            double r = (2 * A) / Math.PI;
            double expected = Math.round(r * r * 100.0) / 100.0;

            double actual =
                    AreaOfASquare.squareArea(A);

            assertEquals(expected, actual, DELTA);
        }
    }
}