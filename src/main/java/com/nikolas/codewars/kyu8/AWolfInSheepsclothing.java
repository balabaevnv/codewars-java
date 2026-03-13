package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: A Wolf in Sheep's Clothing
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Предупредить овцу перед волком в очереди.
 *
 *  ⚡ Решение:
 *     Находим индекс волка с конца массива, формируем сообщение.
 *
 *  📈 Сложность: O(n) время | O(1) память
 *  🔗 https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15
 */
public final class AWolfInSheepsclothing {

    private AWolfInSheepsclothing() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    public static String warnTheSheep(final String[] array) {
        for (int i = 0, n = array.length; i < n; i++) {
            if ("wolf".equals(array[i])) {
                int pos = n - 1 - i;
                return pos == 0 ? "Pls go away and stop eating my sheep"
                        : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
            }
        }
        return "";
    }
}