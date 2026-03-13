package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SwapValuesTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(new Object[]{1,2}, new Object[]{2,1}),
                Arguments.of(new Object[]{"A","B"}, new Object[]{"B","A"}),
                Arguments.of(new Object[]{true,false}, new Object[]{false,true})
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(Object[] input, Object[] expected) {

        SwapValues swapper = new SwapValues(input);
        swapper.swapValues();

        assertArrayEquals(expected, swapper.arguments);
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(new Object[]{0,0}, new Object[]{0,0}),
                Arguments.of(new Object[]{"same","same"}, new Object[]{"same","same"})
        );
    }

    @ParameterizedTest(name = "[{index}] edge input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(Object[] input, Object[] expected) {

        SwapValues swapper = new SwapValues(input);
        swapper.swapValues();

        assertArrayEquals(expected, swapper.arguments);
    }

    static Stream<Arguments> invalidCases() {
        return Stream.of();
    }

    @Test
    void randomTests() {

        for (int i = 0; i < 50; i++) {

            Object a = i;
            Object b = i * 2;

            Object[] arr = new Object[]{a,b};

            SwapValues swapper = new SwapValues(arr);
            swapper.swapValues();

            assertEquals(b, swapper.arguments[0]);
            assertEquals(a, swapper.arguments[1]);
        }
    }
}