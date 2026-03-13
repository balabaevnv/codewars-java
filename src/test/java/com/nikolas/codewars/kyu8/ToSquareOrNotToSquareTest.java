package com.nikolas.codewars.kyu8;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ToSquareOrNotToSquareTest {

    private static Stream<Arguments> sampleProvider() {
        return Stream.of(
                Arguments.of(new int[]{4,3,9,7,2,1}, new int[]{2,9,3,49,4,1}),
                Arguments.of(new int[]{100,101,5,5,1,1}, new int[]{10,10201,25,25,1,1}),
                Arguments.of(new int[]{1,2,3,4,5,6}, new int[]{1,4,9,2,25,36}),
                Arguments.of(new int[]{16,8,36,7}, new int[]{4,64,6,49}),
                Arguments.of(new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{2}, new int[]{4})
        );
    }

    @ParameterizedTest(name = "input={0} => expected={1}")
    @MethodSource("sampleProvider")
    @Order(1)
    @DisplayName("Square or square root tests")
    void testSquareOrSquareRoot(int[] input, int[] expected) {
        int[] actual = ToSquareOrNotToSquare.squareOrSquareRoot(input);
        assertThat(Arrays.toString(actual))
                .as("For input: " + Arrays.toString(input))
                .isEqualTo(Arrays.toString(expected));
    }
}