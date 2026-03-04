package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Возвращает персонализированное приветствие в зависимости от владельца")
class GrasshopperPersonalizedMessageTest {

    @ParameterizedTest(name = "greet({0}, {1}) → {2}")
    @MethodSource("testCases")
    void shouldReturnProperGreeting(String name, String owner, String expected) {
        assertThat(GrasshopperPersonalizedMessage.greet(name, owner))
                .isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("Daniel", "Daniel", "Hello boss"),
                Arguments.of("Greg", "Daniel", "Hello guest"),
                Arguments.of("Alice", "Alice", "Hello boss"),
                Arguments.of("Bob", "Alice", "Hello guest")
        );
    }
}