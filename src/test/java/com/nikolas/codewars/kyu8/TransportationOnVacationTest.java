package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Рассчитывает стоимость аренды машины на отпуск с учетом скидок")
class TransportationOnVacationTest {

    @ParameterizedTest(name = "rentalCarCost({0}) → {1}")
    @MethodSource("testCases")
    void shouldReturnCorrectRentalCost(int days, int expectedCost) {
        assertThat(TransportationOnVacation.rentalCarCost(days))
                .isEqualTo(expectedCost);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(1, 40),   // 1 день — 40$
                Arguments.of(2, 80),   // 2 дня — 80$
                Arguments.of(3, 100),  // 3 дня — 100$ (скидка 20$)
                Arguments.of(4, 140),  // 4 дня — 140$ (скидка 20$)
                Arguments.of(6, 220),  // 6 дней — 220$ (скидка 20$)
                Arguments.of(7, 230),  // 7 дней — 230$ (скидка 50$)
                Arguments.of(8, 270),  // 8 дней — 270$ (скидка 50$)
                Arguments.of(10, 350)  // 10 дней — 350$ (скидка 50$)
        );
    }
}