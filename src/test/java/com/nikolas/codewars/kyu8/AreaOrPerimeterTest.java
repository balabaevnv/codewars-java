package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Вычисляет площадь квадрата или периметр прямоугольника")
class AreaOrPerimeterTest {

    @ParameterizedTest(name = "areaOrPerimeter({0}, {1}) → {2}")
    @CsvSource({
            "4, 4, 16",     // квадрат: площадь = 4 * 4 = 16
            "6, 10, 32",    // прямоугольник: периметр = 2 * (6 + 10) = 32
            "3, 3, 9",      // квадрат: площадь = 3 * 3 = 9
            "5, 8, 26",     // прямоугольник: периметр = 2 * (5 + 8) = 26
            "7, 5, 24"      // прямоугольник: периметр = 2 * (7 + 5) = 24
    })
    void testAreaOrPerimeter(int l, int w, int expected) {
        assertThat(AreaOrPerimeter.areaOrPerimeter(l, w)).isEqualTo(expected);
    }
}