package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PriceOfMangoesTest {

    private static Stream<Arguments> sampleProvider() {
        return Stream.of(
                Arguments.of(2, 3, 6),
                Arguments.of(3, 3, 6),
                Arguments.of(5, 3, 12),
                Arguments.of(9, 5, 30),
                Arguments.of(0, 10, 0),
                Arguments.of(1, 10, 10),
                Arguments.of(6, 4, 16)
        );
    }

    @ParameterizedTest(name = "quantity={0}, price={1} => expected={2}")
    @MethodSource("sampleProvider")
    @Order(1)
    @DisplayName("Price of mangoes - edge and sample cases")
    void testMango(int quantity, int price, int expected) {
        int actual = PriceOfMangoes.mango(quantity, price);
        assertThat(actual)
                .as("Quantity: %d, Price: %d", quantity, price)
                .isEqualTo(expected);
    }
}