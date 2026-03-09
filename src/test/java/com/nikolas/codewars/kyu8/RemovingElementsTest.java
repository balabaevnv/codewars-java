package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Tests for RemovingElements
 */
class RemovingElementsTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(
                        new Object[]{"Hello", "Goodbye", "Hello Again"},
                        new Object[]{"Hello", "Hello Again"}
                ),
                Arguments.of(
                        new Object[]{1,2,3,4,5,6,7,8,9,10},
                        new Object[]{1,3,5,7,9}
                ),
                Arguments.of(
                        new Object[]{new Object[]{1,2}},
                        new Object[]{new Object[]{1,2}}
                ),
                Arguments.of(
                        new Object[]{"Goodbye"},
                        new Object[]{"Goodbye"}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testRemoveEveryOther(Object[] input, Object[] expected) {
        assertArrayEquals(expected, RemovingElements.removeEveryOther(input));
    }
}