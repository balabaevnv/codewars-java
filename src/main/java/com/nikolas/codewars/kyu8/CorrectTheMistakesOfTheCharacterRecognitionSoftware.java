package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Correct the mistakes of the character recognition software
 *
 * 🔗 https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java
 *
 * Pattern:
 * Character Mapping Pattern
 *
 * Ошибки OCR:
 * 5 → S
 * 0 → O
 * 1 → I
 *
 * Алгоритм:
 * 1. преобразуем строку в char[]
 * 2. проходим по каждому символу
 * 3. если символ является ошибкой OCR → заменяем
 * 4. возвращаем новую строку
 *
 * Сложность:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class CorrectTheMistakesOfTheCharacterRecognitionSoftware {

    private CorrectTheMistakesOfTheCharacterRecognitionSoftware() {}

    public static String correct(String string) {

        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            switch (chars[i]) {

                case '5':
                    chars[i] = 'S';
                    break;

                case '0':
                    chars[i] = 'O';
                    break;

                case '1':
                    chars[i] = 'I';
                    break;

                default:
                    // символ остаётся без изменений
            }
        }

        return new String(chars);
    }
}