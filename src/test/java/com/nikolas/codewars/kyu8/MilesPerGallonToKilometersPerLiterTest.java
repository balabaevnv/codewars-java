package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MilesPerGallonToKilometersPerLiterTest {

    private static final double DELTA = 1e-2;

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(10, 3.54),
                Arguments.of(20, 7.08),
                Arguments.of(30, 10.62),
                Arguments.of(4145, 1467.36)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int input, double expected){

        assertEquals(expected,
                MilesPerGallonToKilometersPerLiter.mpgToKPM(input),
                DELTA);
    }

    static Stream<Arguments> edgeCases(){
        return Stream.of(
                Arguments.of(0, 0.0),
                Arguments.of(1, 0.35)
        );
    }

    @ParameterizedTest(name = "[{index}] edge input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(int input,double expected){

        assertEquals(expected,
                MilesPerGallonToKilometersPerLiter.mpgToKPM(input),
                DELTA);
    }

    static Stream<Arguments> invalidCases(){
        return Stream.of();
    }

    @Test
    void randomTests(){

        for(int i=0;i<100;i++){

            int mpg = i * 13;

            double expected =
                    Math.round((mpg * 1.609344 / 4.54609188) * 100.0) / 100.0;

            double actual =
                    MilesPerGallonToKilometersPerLiter.mpgToKPM(mpg);

            assertEquals(expected, actual, DELTA);
        }
    }
}