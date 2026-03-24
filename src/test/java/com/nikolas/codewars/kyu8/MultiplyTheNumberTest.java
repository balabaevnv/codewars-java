package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyTheNumberTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(3,15),
                Arguments.of(10,250),
                Arguments.of(200,25000),
                Arguments.of(0,0),
                Arguments.of(-3,-15)
        );
    }

    @ParameterizedTest(name = "[{index}] number={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int number,int expected){

        assertEquals(expected,
                MultiplyTheNumber.multiply(number));
    }

    static Stream<Arguments> edgeCases(){
        return Stream.of(
                Arguments.of(1,5),
                Arguments.of(-1,-5),
                Arguments.of(999,999*125)
        );
    }

    @ParameterizedTest(name = "[{index}] number={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(int number,int expected){

        assertEquals(expected,
                MultiplyTheNumber.multiply(number));
    }

    static Stream<Arguments> invalidCases(){
        return Stream.of();
    }

    @Test
    void randomTests(){

        for(int i=0;i<100;i++){

            int number =
                    ThreadLocalRandom.current().nextInt(-100000,100000);

            int abs = Math.abs(number);
            int digits = abs == 0 ? 1 : (int)Math.log10(abs) + 1;

            int expected = number * (int)Math.pow(5,digits);

            int actual =
                    MultiplyTheNumber.multiply(number);

            assertEquals(expected,actual);
        }
    }
}