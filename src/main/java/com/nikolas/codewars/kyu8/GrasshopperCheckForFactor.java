package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Grasshopper Check For Factor
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Проверить является ли число factor делителем числа base.
 *
 *     Делитель — это число, при делении на которое
 *     остаток равен 0.
 *
 *  📊 Примеры:
 *     10, 2  → true
 *     63, 7  → true
 *     7, 2   → false
 *
 *  ⚡ Решение:
 *
 *     Используется оператор остатка:
 *
 *         base % factor == 0
 *
 *     Если остаток 0 — значит factor является делителем.
 *
 *     Почему это лучшее решение:
 *
 *     ✔ одна CPU операция modulo
 *     ✔ O(1)
 *     ✔ нет allocations
 *     ✔ нет дополнительных переменных
 *     ✔ максимально простой и читаемый код
 *
 *     Любая другая реализация будет либо длиннее,
 *     либо медленнее.
 *
 *  📈 Сложность:
 *
 *     Время:  O(1)
 *     Память: O(1)
 *
 *  🔗 https://www.codewars.com/kata/55cbc3586671f6aa070000fb
 *
 */
public final class GrasshopperCheckForFactor {

    private GrasshopperCheckForFactor() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Проверяет является ли factor делителем base.
     */
    public static boolean checkForFactor(final int base, final int factor) {

        // Проверяем остаток от деления
        return base % factor == 0;
    }
}