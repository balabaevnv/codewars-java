package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortMyTextbooksTest {

    static Stream<Arguments> validCases() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList("Algebra", "History", "Geometry", "English"),
                        Arrays.asList("Algebra", "English", "Geometry", "History")
                ),
                Arguments.of(
                        Arrays.asList("Algebra", "History", "Geometry", "english"),
                        Arrays.asList("Algebra", "english", "Geometry", "History")
                ),
                Arguments.of(
                        Arrays.asList("Alg#bra", "$istory", "Geom^try", "**English"),
                        Arrays.asList("$istory", "**English", "Alg#bra", "Geom^try")
                ),
                Arguments.of(
                        Arrays.asList("a", "B", "c", "D"),
                        Arrays.asList("a", "B", "c", "D")  // уже отсортирован
                )
        );
    }

    @ParameterizedTest(name = "[{index}] input={0} -> expected={1}")
    @MethodSource("validCases")
    void validTests(List<String> input, List<String> expected) {
        // Создаём копию, так как метод изменяет исходный список
        List<String> copy = new ArrayList<>(input);
        assertEquals(expected, SortMyTextbooks.sort(copy));
    }

    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(new ArrayList<String>(), new ArrayList<String>()),
                Arguments.of(Collections.singletonList("Algebra"), Collections.singletonList("Algebra")),
                Arguments.of(null, new ArrayList<String>()) // защита от null
        );
    }

    @ParameterizedTest(name = "[{index}] edge input={0} -> expected={1}")
    @MethodSource("edgeCases")
    void edgeTests(List<String> input, List<String> expected) {
        if (input == null) {
            assertEquals(expected, SortMyTextbooks.sort(null));
        } else {
            List<String> copy = new ArrayList<>(input);
            assertEquals(expected, SortMyTextbooks.sort(copy));
        }
    }

    static Stream<Arguments> invalidCases() {
        return Stream.empty(); // нет невалидных входов
    }

    @Test
    void randomTests() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int size = rand.nextInt(20);
            List<String> original = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                original.add(randomString(rand));
            }
            List<String> copy = new ArrayList<>(original);
            List<String> expected = original.stream()
                    .sorted(String.CASE_INSENSITIVE_ORDER)
                    .collect(Collectors.toList());
            assertEquals(expected, SortMyTextbooks.sort(copy));
        }
    }

    private String randomString(Random rand) {
        int len = rand.nextInt(10) + 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = (char) (rand.nextInt(95) + 32); // печатные ASCII
            sb.append(c);
        }
        return sb.toString();
    }
}