package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TipCalculatorTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(30.0, "poor", 2),
                Arguments.of(20.0, "Excellent", 4),
                Arguments.of(107.65, "GReat", 17)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0}, rating={1} -> expected={2}")
    @MethodSource("validCases")
    void validTests(double amount, String rating, Integer expected){
        assertEquals(expected, TipCalculator.calculateTip(amount, rating));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(50.0, "terrible", 0),
                Arguments.of(0.0, "good", 0),
                Arguments.of(99.99, "excellent", 20)
        );
    }

    @ParameterizedTest(name = "[{index}] edge input={0}, rating={1} -> expected={2}")
    @MethodSource("edgeCases")
    void edgeTests(double amount, String rating, Integer expected){
        assertEquals(expected, TipCalculator.calculateTip(amount, rating));
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of(
                Arguments.of(20.0, "unknown", null),
                Arguments.of(15.0, null, null)
        );
    }

    @Test
    void randomTests(){
        for(int i = 0; i < 100; i++){
            double amount = i * 3.5;
            String rating = "good";
            int expected = (int)Math.ceil(amount * 0.10);
            assertEquals(expected, TipCalculator.calculateTip(amount, rating));
        }
    }
}