package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Function 1 — hello world
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Написать функцию greet, возвращающую "hello world!".
 *
 *  📊 Примеры:
 *     greet()  →  "hello world!"
 *
 *  ⚡ Решение:
 *     Строковый литерал из String Pool.
 *     Ноль аллокаций, одна инструкция ldc в байткоде.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/523b4ff7adca849afe000035
 *
 */
public final class Function1HelloWorld {

    private Function1HelloWorld() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Возвращает "hello world!".
     *
     *  Почему строковый литерал:
     *     — String Pool: одна ссылка на всё время жизни JVM
     *     — Одна инструкция ldc (load constant) в байткоде
     *     — Конкатенация: компилятор свернёт, но зачем заставлять думать
     *     — String.format: Formatter + парсинг шаблона ради константы
     *     — StringBuilder: 2 аллокации ради неизменяемого текста
     *
     * @return "hello world!"
     */
    public static String greet() {
        // Литерал из String Pool — ноль аллокаций
        return "hello world!";
    }
}