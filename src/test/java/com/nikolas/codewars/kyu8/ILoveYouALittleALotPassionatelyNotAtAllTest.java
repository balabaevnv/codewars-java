package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ILoveYouALittleALotPassionatelyNotAtAllTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, "I love you"),
                Arguments.of(2, "a little"),
                Arguments.of(3, "a lot"),
                Arguments.of(4, "passionately"),
                Arguments.of(5, "madly"),
                Arguments.of(6, "not at all"),
                Arguments.of(7, "I love you"),
                Arguments.of(8, "a little"),
                Arguments.of(12, "not at all"),
                Arguments.of(13, "I love you")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testPetals(int petals, String expected) {
        assertEquals(expected,
                ILoveYouALittleALotPassionatelyNotAtAll.howMuchILoveYou(petals));
    }
}