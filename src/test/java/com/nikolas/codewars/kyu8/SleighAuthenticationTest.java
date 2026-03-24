package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SleighAuthenticationTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of("Santa Claus","Ho Ho Ho!",true)
        );
    }

    @ParameterizedTest(name = "[{index}] name={0}, password={1} -> expected={2}")
    @MethodSource("validCases")
    void validTests(String name,String password,boolean expected){

        assertEquals(expected,
                SleighAuthentication.authenticate(name,password));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of("Santa","Ho Ho Ho!",false),
                Arguments.of("Santa Claus","Ho Ho Ho",false),
                Arguments.of("","",false),
                Arguments.of("santa claus","Ho Ho Ho!",false)
        );
    }

    @ParameterizedTest(name = "[{index}] name={0}, password={1} -> expected={2}")
    @MethodSource("edgeCases")
    void edgeTests(String name,String password,boolean expected){

        assertEquals(expected,
                SleighAuthentication.authenticate(name,password));
    }

    static Stream<Arguments> invalidCases(){
        return Stream.of(
                Arguments.of(null,"Ho Ho Ho!",false),
                Arguments.of("Santa Claus",null,false)
        );
    }

    @ParameterizedTest(name = "[{index}] name={0}, password={1} -> expected={2}")
    @MethodSource("invalidCases")
    void invalidTests(String name,String password,boolean expected){

        assertEquals(expected,
                SleighAuthentication.authenticate(name,password));
    }

    @Test
    void randomTests(){

        for(int i=0;i<100;i++){

            String name = "User"+i;
            String password = "pass"+i;

            boolean expected =
                    "Santa Claus".equals(name)
                            && "Ho Ho Ho!".equals(password);

            boolean actual =
                    SleighAuthentication.authenticate(name,password);

            assertEquals(expected,actual);
        }
    }
}