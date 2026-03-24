package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTemplatesBugFixing5Test {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(new String[]{"Cheese","Milk","Chocolate"},
                        "I like Cheese, Milk, Chocolate!"),
                Arguments.of(new String[]{"Cheese","Milk"},
                        "I like Cheese, Milk!"),
                Arguments.of(new String[]{"Chocolate"},
                        "I like Chocolate!")
        );
    }

    @ParameterizedTest(name = "[{index}] items={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(String[] items,String expected){

        assertEquals(expected,
                StringTemplatesBugFixing5.buildString(items));
    }

    static Stream<Arguments> edgeCases(){
        return Stream.of(
                Arguments.of(new String[]{"Apple"},
                        "I like Apple!"),
                Arguments.of(new String[]{"A","B","C","D"},
                        "I like A, B, C, D!")
        );
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    void edgeTests(String[] items,String expected){

        assertEquals(expected,
                StringTemplatesBugFixing5.buildString(items));
    }

    static Stream<Arguments> invalidCases(){
        return Stream.of();
    }

    @Test
    void randomTests(){

        for(int i=0;i<50;i++){

            String[] items = {"Item"+i};

            String expected =
                    "I like " + String.join(", ", items) + "!";

            String actual =
                    StringTemplatesBugFixing5.buildString(items);

            assertEquals(expected,actual);
        }
    }
}