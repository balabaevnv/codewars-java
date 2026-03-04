package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Grasshopper - Personalized Message
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Вернуть персонализированное приветствие.
 *
 *  ⚡ Решение:
 *     Сравнение строк через equals().
 *
 *  📈 Сложность: O(1)
 *
 */
public final class GrasshopperPersonalizedMessage {

    private GrasshopperPersonalizedMessage() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Возвращает персонализированное приветствие.
     *
     * @param name  имя пользователя
     * @param owner имя владельца
     * @return строка приветствия
     */
    public static String greet(final String name, final String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}