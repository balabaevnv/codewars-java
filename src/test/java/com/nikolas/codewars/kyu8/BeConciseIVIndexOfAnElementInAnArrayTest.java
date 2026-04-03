package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeConciseIVIndexOfAnElementInAnArrayTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(new String[]{"2", "3", "5", "7", "11", "2"}, "5", "2"),
                Arguments.of(new String[]{"2", "3", "5", "7", "11", "2"}, "11", "4"),
                Arguments.of(new String[]{"2", "3", "5", "7", "11", "2"}, "843646", "Not found")
        );
    }

    @ParameterizedTest(name = "[{index}] array={0}, str={1} -> expected={2}")
    @MethodSource("validCases")
    void validTests(String[] array, String str, String expected) {
        assertEquals(expected, BeConciseIVIndexOfAnElementInAnArray.kata(array, str));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(new String[]{}, "any", "Not found"),
                Arguments.of(new String[]{"a"}, "a", "0"),
                Arguments.of(new String[]{"a"}, "b", "Not found")
        );
    }

    @ParameterizedTest(name = "[{index}] array={0}, str={1} -> expected={2}")
    @MethodSource("edgeCases")
    void edgeTests(String[] array, String str, String expected) {
        assertEquals(expected, BeConciseIVIndexOfAnElementInAnArray.kata(array, str));
    }

    @Test
    void randomTests() {
        for (int t = 0; t < 100; t++) {
            int size = (int) (Math.random() * 20);
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = "x" + i;
            }
            String search;
            String expected;
            if (size == 0) {
                search = "not-exists";
                expected = "Not found";
            } else {
                search = (Math.random() < 0.5) ? array[(int)(Math.random() * size)] : "not-exists";
                expected = findIndexReference(array, search);
            }
            assertEquals(expected, BeConciseIVIndexOfAnElementInAnArray.kata(array, search));
        }
    }


    private String findIndexReference(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) return Integer.toString(i);
        }
        return "Not found";
    }
}