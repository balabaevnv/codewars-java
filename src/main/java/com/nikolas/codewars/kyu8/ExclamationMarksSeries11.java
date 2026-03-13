package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Exclamation Marks Series #11
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Заменить все гласные буквы в строке на '!'.
 *
 *  📊 Примеры:
 *     "Hi!"        → "H!!"
 *     "!Hi! Hi!"   → "!H!! H!!"
 *     "aeiou"      → "!!!!!"
 *     "ABCDE"      → "!BCD!"
 *
 *  ⚡ Решение:
 *     char[] + один проход по строке.
 *     Проверка гласной через switch.
 *
 *     Без:
 *       — regex
 *       — replaceAll
 *       — streams
 *
 *  📈 Сложность: O(n) время | O(n) память
 *     где n = длина строки
 *
 *  🔗 https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed
 *
 */
public final class ExclamationMarksSeries11 {

    private ExclamationMarksSeries11() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Заменяет все гласные буквы на '!'.
     *
     *  Почему char[] + switch:
     *
     *     — toCharArray() — один проход
     *     — switch — быстрый lookup JVM
     *     — один цикл O(n)
     *
     *     Альтернативы хуже:
     *
     *     replaceAll → regex engine
     *     streams    → allocation + lambda
     *     replace    → много проходов
     *
     * @param s входная строка
     * @return строка с заменёнными гласными
     */
    public static String replace(final String s) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            switch (chars[i]) {

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    chars[i] = '!';
                    break;
            }
        }

        return new String(chars);
    }
}