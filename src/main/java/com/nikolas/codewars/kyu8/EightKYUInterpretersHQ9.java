package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: 8kyu interpreters: HQ9+
 *
 * 🔗 https://www.codewars.com/kata/591588d49f4056e13f000001/train/java
 *
 * Pattern: Интерпретатор команд, кэширование песни
 *
 * Complexity:
 * Time  : O(1) для H/Q, O(1) для 9 после первого вызова
 * Memory: O(1) константный размер строки
 */
public final class EightKYUInterpretersHQ9 {
    private EightKYUInterpretersHQ9() {}

    private static final String BEER_SONG = generateBeerSong();

    public static String HQ9(char code) {
        switch (code) {
            case 'H': return "Hello World!";
            case 'Q': return "Q";
            case '9': return BEER_SONG;
            default: return null;
        }
    }

    private static String generateBeerSong() {
        StringBuilder sb = new StringBuilder(6000);
        for (int i = 99; i > 0; i--) {
            sb.append(i).append(i == 1 ? " bottle" : " bottles")
                    .append(" of beer on the wall, ")
                    .append(i).append(i == 1 ? " bottle" : " bottles")
                    .append(" of beer.\n")
                    .append("Take one down and pass it around, ");
            if (i - 1 == 0) {
                sb.append("no more bottles");
            } else {
                sb.append(i - 1).append(i - 1 == 1 ? " bottle" : " bottles");
            }
            sb.append(" of beer on the wall.\n");
        }
        sb.append("No more bottles of beer on the wall, no more bottles of beer.\n")
                .append("Go to the store and buy some more, 99 bottles of beer on the wall.");
        return sb.toString();
    }
}