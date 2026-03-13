package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: The If Function
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Выполнить одну из двух функций в зависимости от truthy/falsy аргумента.
 *
 *  ⚡ Решение:
 *     Ternary с Boolean.TRUE.equals для null-safe вызова Runnable.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *  🔗 https://www.codewars.com/kata/54147087d5c2ebe4f1000805
 */
public final class TheIfFunction {

    private TheIfFunction() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Выполняет func1 если bool истинен, иначе func2.
     * Null считается falsy.
     *
     * @param bool проверяемое значение
     * @param func1 выполняется если true
     * @param func2 выполняется если false/null
     */
    public static void _if(final Boolean bool, final Runnable func1, final Runnable func2) {
        (Boolean.TRUE.equals(bool) ? func1 : func2).run();
    }
}