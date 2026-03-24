package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BasicSubclassesAdamAndEveTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(true) // просто триггер
        );
    }

    @ParameterizedTest(name = "[{index}] basic creation test")
    @MethodSource("validCases")
    void validTests(boolean dummy){

        Human[] paradise = BasicSubclassesAdamAndEve.create();

        assertEquals(2, paradise.length);
        assertTrue(paradise[0] instanceof Man);
        assertTrue(paradise[1] instanceof Woman);
    }

    static Stream<Arguments> edgeCases(){
        return Stream.of(
                Arguments.of(true)
        );
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    void edgeTests(boolean dummy){

        Human[] paradise = BasicSubclassesAdamAndEve.create();

        assertNotNull(paradise);
        assertNotNull(paradise[0]);
        assertNotNull(paradise[1]);
    }

    static Stream<Arguments> invalidCases(){
        return Stream.of();
    }

    @Test
    void randomTests(){

        for(int i = 0; i < 50; i++){

            Human[] paradise = BasicSubclassesAdamAndEve.create();

            assertTrue(paradise[0] instanceof Man);
            assertTrue(paradise[1] instanceof Woman);
        }
    }
}