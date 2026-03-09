package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: Thinkful - Logic Drills: Traffic Light
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Нужно создать функцию, которая переключает свет светофора по циклу:
 *     green -> yellow -> red -> green -> ...
 *
 *  📊 Примеры:
 *     "red"    → "green"
 *     "yellow" → "red"
 *     "green"  → "yellow"
 *
 *  ⚡ Решение:
 *     Используем условие для смены состояний светофора.
 *     Простая логика на основе строк.
 *
 *  📈 Сложность: O(1) время | O(1) память
 *     Здесь мы просто сравниваем строку с константами и возвращаем результат.
 *
 *  🔗 https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java
 *
 */
public final class ThinkfulLogicDrillsTrafficLight {

    private ThinkfulLogicDrillsTrafficLight() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Переключает светофор с текущего состояния на следующее.
     *
     *  Почему решение с использованием if:
     *     — Логика проста и понятна
     *     — Четко следуем задаче: 3 состояния, каждое приводит к следующему.
     *     — Сложность O(1) — за 1 операцию возвращаем результат.
     *
     * @param current текущее состояние светофора (строка)
     * @return следующее состояние светофора
     */
    public static String updateLight(final String current) {
        // Смена состояний светофора по циклу
        if ("green".equals(current)) {
            return "yellow";
        } else if ("yellow".equals(current)) {
            return "red";
        } else {
            return "green";
        }
    }
}