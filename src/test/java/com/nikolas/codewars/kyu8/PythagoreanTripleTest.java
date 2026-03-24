package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PythagoreanTripleTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(new int[]{3,4,5}, 1),
                Arguments.of(new int[]{5,3,4}, 1),
                Arguments.of(new int[]{13,12,5}, 1)
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int[] input, int expected){

        assertEquals(expected,
                new PythagoreanTriple().pythagoreanTriple(input));
    }

    static Stream<Arguments> edgeCases(){
        return Stream.of(
                Arguments.of(new int[]{1,1,1}, 0),
                Arguments.of(new int[]{0,0,0}, 1), // 0²+0²=0²
                Arguments.of(new int[]{6,8,10}, 1)
        );
    }

    @ParameterizedTest(name = "[{index}] edge input -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(int[] input, int expected){

        assertEquals(expected,
                new PythagoreanTriple().pythagoreanTriple(input));
    }

    static Stream<Arguments> invalidCases(){
        return Stream.of();
    }

    @Test
    void randomTests(){

        for(int i = 1; i < 100; i++){

            int a = i;
            int b = i + 1;
            int c = (int)Math.sqrt(a*a + b*b);

            int[] triple = {a,b,c};

            int expected = (a*a + b*b == c*c) ? 1 : 0;

            int actual = new PythagoreanTriple().pythagoreanTriple(triple);

            assertEquals(expected, actual);
        }
    }
}