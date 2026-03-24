package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class USDCNYTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(15,"101.25 Chinese Yuan"),
                Arguments.of(465,"3138.75 Chinese Yuan")
        );
    }

    @ParameterizedTest(name = "[{index}] usd={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(int usd,String expected){

        assertEquals(expected,
                USDCNY.usdcny(usd));
    }

    static Stream<Arguments> edgeCases(){
        return Stream.of(
                Arguments.of(0,"0.00 Chinese Yuan"),
                Arguments.of(1,"6.75 Chinese Yuan"),
                Arguments.of(100,"675.00 Chinese Yuan")
        );
    }

    @ParameterizedTest(name = "[{index}] usd={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(int usd,String expected){

        assertEquals(expected,
                USDCNY.usdcny(usd));
    }

    static Stream<Arguments> invalidCases(){
        return Stream.of();
    }

    @Test
    void randomTests(){

        for(int i=0;i<100;i++){

            int usd =
                    ThreadLocalRandom.current().nextInt(0,10000);

            String expected =
                    String.format("%.2f Chinese Yuan", usd * 6.75);

            String actual =
                    USDCNY.usdcny(usd);

            assertEquals(expected,actual);
        }
    }
}