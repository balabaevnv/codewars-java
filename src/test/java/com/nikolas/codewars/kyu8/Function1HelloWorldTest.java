package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Hello World")
class Function1HelloWorldTest {

    @Test
    @DisplayName("greet() → \"hello world!\"")
    void shouldReturnHelloWorld() {
        assertThat(Function1HelloWorld.greet()).isEqualTo("hello world!");
    }
}