package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata – Draw stairs
 * 🔗 https://www.codewars.com/kata/5b4e779c578c6a898e0005c5
 *
 * Pattern: Генерация строки заданного формата (лестница) с использованием StringBuilder.
 * Complexity:
 * Time  : O(n²) — нижняя граница, так как вывод содержит Θ(n²) символов.
 * Memory: O(n²) — итоговая строка занимает n(n-1)/2 + 2n - 1 символов.
 *
 * Данное решение является микрооптимизированным:
 * - предварительное вычисление ёмкости StringBuilder
 * - ручное добавление пробелов (без создания промежуточных строк)
 * - минимальное количество аллокаций
 */
public final class DrawStairs {

    private DrawStairs() {}

    /**
     * Draws stairs of height and width n using the letter 'I'.
     *
     * @param n number of steps, must be non-negative
     * @return formatted string or empty string if n <= 0
     */
    public static String draw(int n) {
        if (n <= 0) {
            return "";
        }
        int spacesTotal = n * (n - 1) / 2;          // сумма пробелов 0 + 1 + ... + (n-1)
        int totalChars = spacesTotal + n + (n - 1); // пробелы + 'I' + '\n'
        StringBuilder sb = new StringBuilder(totalChars);

        for (int i = 0; i < n; i++) {
            // добавляем i пробелов
            for (int j = 0; j < i; j++) {
                sb.append(' ');
            }
            sb.append('I');
            if (i < n - 1) {
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}