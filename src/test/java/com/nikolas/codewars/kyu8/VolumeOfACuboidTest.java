package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

@DisplayName("Вычисляет объем прямоугольного параллелепипеда")
class VolumeOfACuboidTest {

    @ParameterizedTest(name = "getVolumeOfCuboid({0}, {1}, {2}) → {3}")
    @CsvSource({
            "1, 2, 2, 4",
            "6.3, 2, 5, 63",
            "3, 3, 3, 27",
            "5, 5, 5, 125",
            "7, 7, 7, 343"
    })
    void testVolume(double length, double width, double height, double expected) {
        assertThat(VolumeOfACuboid.getVolumeOfCuboid(length, width, height)).isEqualTo(expected, withPrecision(0.0001));
    }
}