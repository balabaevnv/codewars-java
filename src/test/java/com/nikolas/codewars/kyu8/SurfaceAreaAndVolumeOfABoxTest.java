package com.nikolas.codewars.kyu8;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SurfaceAreaAndVolumeOfABoxTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testGetSize(int w, int h, int d, int[] expected) {
        assertThat(SurfaceAreaAndVolumeOfABox.getSize(w,h,d)).isEqualTo(expected);
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{4,2,6, new int[]{88,48}},
                new Object[]{1,1,1, new int[]{6,1}},
                new Object[]{1,2,1, new int[]{10,2}},
                new Object[]{1,2,2, new int[]{16,4}},
                new Object[]{10,10,10, new int[]{600,1000}}
        );
    }
}