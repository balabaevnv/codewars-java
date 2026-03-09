package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Третий угол треугольника")
class ThirdAngleOfATriangleTest {

    @ParameterizedTest(name = "otherAngle({0}, {1}) → {2}")
    @CsvSource({
            "45, 12, 123",  // Пример с углами 45 и 12
            "50, 60, 70",   // Пример с углами 50 и 60
            "30, 30, 120",  // Пример с углами 30 и 30
            "60, 60, 60"    // Пример с углами 60 и 60
    })
    void shouldReturnThirdAngle(int angle1, int angle2, int expected) {
        assertThat(ThirdAngleOfATriangle.otherAngle(angle1, angle2)).isEqualTo(expected);
    }
}