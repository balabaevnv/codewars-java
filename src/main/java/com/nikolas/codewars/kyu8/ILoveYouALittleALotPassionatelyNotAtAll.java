package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * I Love You, a Little, a Lot, Passionately... Not at All
 *
 * 🔗 https://www.codewars.com/kata/57f24e6a18e9fad8eb000296/train/java
 *
 * Pattern:
 * Circular Sequence via Modulo
 *
 * Последовательность фраз:
 *
 * 1 → I love you
 * 2 → a little
 * 3 → a lot
 * 4 → passionately
 * 5 → madly
 * 6 → not at all
 *
 * После 6 последовательность повторяется.
 *
 * Формула:
 * index = (nb_petals - 1) % 6
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class ILoveYouALittleALotPassionatelyNotAtAll {

    private ILoveYouALittleALotPassionatelyNotAtAll() {}

    private static final String[] PHRASES = {
            "I love you",
            "a little",
            "a lot",
            "passionately",
            "madly",
            "not at all"
    };

    public static String howMuchILoveYou(int nb_petals) {

        return PHRASES[(nb_petals - 1) % PHRASES.length];
    }
}