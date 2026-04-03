package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilteringEvenNumbersBugFixesTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(
                        new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7)),
                        new LinkedList<>(Arrays.asList(1, 3, 5, 7))
                ),
                Arguments.of(
                        new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4)),
                        new LinkedList<>(Arrays.asList(1, 3))
                ),
                Arguments.of(
                        new ArrayList<>(Arrays.asList(1, 3, 5, 7)),
                        new ArrayList<>(Arrays.asList(1, 3, 5, 7))
                ),
                Arguments.of(
                        new ArrayList<>(Arrays.asList(2, 4, 6, 8)),
                        new ArrayList<>()
                )
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(List<Integer> input, List<Integer> expected) {
        List<Integer> result = FilteringEvenNumbersBugFixes.filterOddNumber(input);
        assertEquals(expected, result);
        // Проверяем, что исходный список изменился (ссылка та же)
        assertEquals(expected, input);
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(new ArrayList<>(), new ArrayList<>()),
                Arguments.of(null, new ArrayList<>())
        );
    }

    @ParameterizedTest(name = "[{index}] edge input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(List<Integer> input, List<Integer> expected) {
        List<Integer> result = FilteringEvenNumbersBugFixes.filterOddNumber(input);
        assertEquals(expected, result);
    }

    @Test
    void randomTests() {
        Random rand = new Random();
        for (int t = 0; t < 100; t++) {
            int size = rand.nextInt(50);
            List<Integer> original = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                original.add(rand.nextInt(200) - 100);
            }
            List<Integer> copy = new ArrayList<>(original);
            List<Integer> expected = new ArrayList<>();
            for (Integer num : copy) {
                if (num % 2 != 0) expected.add(num);
            }
            List<Integer> result = FilteringEvenNumbersBugFixes.filterOddNumber(original);
            assertEquals(expected, result);
            // Проверяем, что исходный список изменился (если не null)
            assertEquals(expected, original);
        }
    }
}