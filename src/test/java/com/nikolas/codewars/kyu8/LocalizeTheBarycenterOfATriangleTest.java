package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LocalizeTheBarycenterOfATriangleTest {

    @Test
    void sampleTests() {
        doTest(new double[]{4, 6}, new double[]{12, 4}, new double[]{10, 10},
                new double[]{8.6667, 6.6667});
        doTest(new double[]{4, 2}, new double[]{12, 2}, new double[]{6, 10},
                new double[]{7.3333, 4.6667});
        doTest(new double[]{4, 8}, new double[]{8, 2}, new double[]{16, 6},
                new double[]{9.3333, 5.3333});
        doTest(new double[]{0, 0}, new double[]{1, 3}, new double[]{-1, 6},
                new double[]{0.0, 3.0});
        doTest(new double[]{0, 0}, new double[]{1, 6}, new double[]{8, -6},
                new double[]{3.0, 0.0});
    }

    // ---- Дополнительные граничные случаи ----
    static Stream<Arguments> edgeCases() {
        return Stream.of(
                Arguments.of(new double[]{0,0}, new double[]{0,0}, new double[]{0,0}, new double[]{0.0, 0.0}),
                Arguments.of(new double[]{-1,-1}, new double[]{1,1}, new double[]{0,0}, new double[]{0.0, 0.0}),
                Arguments.of(new double[]{1,2}, new double[]{3,4}, new double[]{5,6}, new double[]{3.0, 4.0})
        );
    }

    @ParameterizedTest
    @MethodSource("edgeCases")
    void edgeTests(double[] x, double[] y, double[] z, double[] expected) {
        doTest(x, y, z, expected);
    }

    // ---- Случайные тесты ----
    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            double[] x = {Math.random() * 200 - 100, Math.random() * 200 - 100};
            double[] y = {Math.random() * 200 - 100, Math.random() * 200 - 100};
            double[] z = {Math.random() * 200 - 100, Math.random() * 200 - 100};
            double[] expected = referenceCentroid(x, y, z);
            doTest(x, y, z, expected);
        }
    }

    private void doTest(double[] x, double[] y, double[] z, double[] expected) {
        String message = String.format("x = %s; y = %s; z = %s\n",
                Arrays.toString(x), Arrays.toString(y), Arrays.toString(z));
        double[] actual = LocalizeTheBarycenterOfATriangle.barTriang(x, y, z);
        assertArrayEquals(expected, actual, 1e-4, message);
    }

    // Эталонная реализация (без округления, но для сравнения с дельтой)
    private double[] referenceCentroid(double[] x, double[] y, double[] z) {
        double xO = (x[0] + y[0] + z[0]) / 3.0;
        double yO = (x[1] + y[1] + z[1]) / 3.0;
        return new double[]{xO, yO};
    }
}
