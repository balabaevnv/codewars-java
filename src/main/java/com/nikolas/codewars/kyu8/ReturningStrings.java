package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Returning Strings
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Вернуть приветственное сообщение с именем.
 *
 *  📊 Примеры:
 *     "Ryan"  →  "Hello, Ryan how are you doing today?"
 *     "Sara"  →  "Hello, Sara how are you doing today?"
 *
 *  ⚡ Решение:
 *     Конкатенация + — с Java 9+ через StringConcatFactory:
 *     одна аллокация, без промежуточных буферов.
 *
 *  📈 Сложность: O(n) время | O(n) память
 *     где n = длина имени
 *
 *  🔗 https://www.codewars.com/kata/55a70521798b14d4750000a4
 *
 */
public final class ReturningStrings {

    private ReturningStrings() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Возвращает приветственное сообщение с именем.
     *
     *  Почему конкатенация +, а не String.format:
     *     — Java 9+: invokedynamic + StringConcatFactory
     *     — Одна аллокация нужного размера (без resize)
     *     — String.format: Formatter + парсинг шаблона — в 10-20x медленнее
     *     — StringBuilder: ручное управление — медленнее StringConcatFactory
     *     — String.concat: два промежуточных String
     *
     * @param name имя для приветствия
     * @return приветственное сообщение
     */
    public static String greet(final String name) {
        // Конкатенация — оптимизирована компилятором Java 9+
        return "Hello, " + name + " how are you doing today?";
    }
}