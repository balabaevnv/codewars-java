package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Basic Mathematical Operations
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Выполнить одну из четырёх арифметических операций
 *     над двумя числами.
 *
 *  📊 Примеры:
 *     "+", 4, 7   →  11
 *     "-", 15, 18 →  -3
 *     "*", 5, 5   →  25
 *     "/", 49, 7  →  7
 *
 *  ⚡ Решение:
 *     Switch expression (Java 14+) — один lookup,
 *     без fall-through, без break.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *
 *  🔗 https://www.codewars.com/kata/57356c55867b9b7a60000bd7
 *
 */
public final class BasicMathematicalOperations {

    private BasicMathematicalOperations() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Выполняет арифметическую операцию над двумя числами.
     *
     *  Почему switch expression:
     *     — Один lookup по hashCode + equals — O(1)
     *     — Нет fall-through (без break) — безопаснее
     *     — if-else: до 4 сравнений equals в худшем случае
     *     — Map BiFunction: 10+ объектов + autoboxing
     *
     * @param op оператор: "+", "-", "*", "/"
     * @param v1 первый операнд
     * @param v2 второй операнд
     * @return результат операции
     */
    public static Integer basicMath(final String op, final int v1, final int v2) {
        // Switch expression — компактно и безопасно
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> throw new IllegalArgumentException("Неизвестный оператор: " + op);
        };
    }
}