package com.nikolas.codewars.kyu8;

/**
 * Codewars:
 * <a href="https://www.codewars.com/kata/5168bb5dfe9a00b126000018">Reversed Strings</a>
 *
 * <p>Разворачивает строку задом наперёд.</p>
 */
public final class ReversedStrings {

    private ReversedStrings() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Время:   O(n), где n — длина строки (один проход для копирования + один для swap)
     * Память:  O(n) — буфер StringBuilder + финальный String
     *
     * <p>Используется {@link StringBuilder#reverse()} — единственный способ
     * в стандартной библиотеке, который корректно обрабатывает
     * суррогатные пары Unicode (эмодзи, CJK-символы за пределами BMP).</p>
     *
     * @param str исходная строка
     * @return развёрнутая строка
     */
    public static String solution(final String str) {
        // Один вызов — реверс с корректной обработкой Unicode
        return new StringBuilder(str).reverse().toString();
    }
}