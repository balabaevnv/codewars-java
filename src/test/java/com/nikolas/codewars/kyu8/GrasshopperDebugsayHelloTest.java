package com.nikolas.codewars.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GrasshopperDebugsayHelloTest {

    @ParameterizedTest
    @MethodSource("data")
    void testSayHello(String name, String expected) {
        assertEquals(expected, GrasshopperDebugsayHello.sayHello(name));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("Mr. Spock", "Hello, Mr. Spock"),
                Arguments.of("Captain Kirk", "Hello, Captain Kirk"),
                Arguments.of("Liutenant Uhura", "Hello, Liutenant Uhura"),
                Arguments.of("Dr. McCoy", "Hello, Dr. McCoy")
        );
    }
}