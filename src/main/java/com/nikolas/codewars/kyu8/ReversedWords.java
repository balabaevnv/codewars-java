package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 *
 * Reverse Words
 *
 * https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/java
 *
 * Задача:
 * Развернуть порядок слов в строке.
 *
 * Пример:
 * "hello world" -> "world hello"
 *
 * Ограничения:
 * - слова разделены одним пробелом
 * - нет leading/trailing spaces
 *
 * Алгоритм (optimal):
 * 1. Идём по строке справа налево
 * 2. Находим границы слова
 * 3. Добавляем его в StringBuilder
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public final class ReversedWords {

    private ReversedWords() {
        // utility class
    }

    public static String reverseWords(String str) {

        // быстрый выход
        if (str == null || str.isEmpty()) {
            return "";
        }

        // сразу резервируем память
        StringBuilder result = new StringBuilder(str.length());

        int end = str.length() - 1;

        while (end >= 0) {

            int start = end;

            // ищем начало слова
            while (start >= 0 && str.charAt(start) != ' ') {
                start--;
            }

            // добавляем слово
            result.append(str, start + 1, end + 1);

            // если не последнее слово — добавляем пробел
            if (start > 0) {
                result.append(' ');
            }

            end = start - 1;
        }

        return result.toString();
    }
}