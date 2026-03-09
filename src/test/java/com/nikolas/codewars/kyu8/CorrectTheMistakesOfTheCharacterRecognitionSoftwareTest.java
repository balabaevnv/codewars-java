package com.nikolas.codewars.kyu8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CorrectTheMistakesOfTheCharacterRecognitionSoftwareTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("1F-RUDYARD K1PL1NG", "IF-RUDYARD KIPLING"),
                Arguments.of("R0BERT MERLE - THE DAY 0F THE D0LPH1N", "ROBERT MERLE - THE DAY OF THE DOLPHIN"),
                Arguments.of("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5",
                        "RICHARD P. FEYNMAN - THE FEYNMAN LECTURES ON PHYSICS"),
                Arguments.of("5TEPHEN HAWK1NG - A BR1EF H15T0RY 0F T1ME",
                        "STEPHEN HAWKING - A BRIEF HISTORY OF TIME"),
                Arguments.of("ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5",
                        "ERNEST HEMINGWAY - FOR WHOM THE BELL TOLLS"),
                Arguments.of("J. R. R. T0LK1EN - THE L0RD 0F THE R1NG5",
                        "J. R. R. TOLKIEN - THE LORD OF THE RINGS"),
                Arguments.of("UR5ULA K. LE GU1N - THE FARTHE5T 5H0RE",
                        "URSULA K. LE GUIN - THE FARTHEST SHORE")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testCorrection(String input, String expected) {
        assertEquals(expected,
                CorrectTheMistakesOfTheCharacterRecognitionSoftware.correct(input));
    }
}