package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrintingArrayElementsWithCommaDelimitersTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new Object[]{"h","o","l","a"}, "h,o,l,a"),
                Arguments.of(new Object[]{2,4,5,2}, "2,4,5,2"),
                Arguments.of(new Object[]{true,false,true}, "true,false,true"),
                Arguments.of(new Object[]{"one"}, "one"),
                Arguments.of(new Object[]{}, "")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(Object[] input, String expected) {
        assertEquals(expected,
                PrintingArrayElementsWithCommaDelimiters.printArray(input));
    }
}