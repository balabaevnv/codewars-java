package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Секретное сообщение Дженни")
class JennysSecretMessageTest {

    @ParameterizedTest(name = "greet(\"{0}\") → \"{1}\"")
    @CsvSource({
            "'Jim', 'Hello, Jim!'",
            "'Jane', 'Hello, Jane!'",
            "'Simon', 'Hello, Simon!'",
            "'Johnny', 'Hello, my love!'"
    })
    void shouldGreetCorrectly(String name, String expected) {
        assertThat(JennysSecretMessage.greet(name)).isEqualTo(expected);
    }
}