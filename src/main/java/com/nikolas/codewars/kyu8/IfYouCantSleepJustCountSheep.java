package com.nikolas.codewars.kyu8;

/**
 * ════════════════════════════════════════════════════════════
 *  🎯 Codewars: If you can't sleep, just count sheep!!
 * ════════════════════════════════════════════════════════════
 *
 *  📋 Задача:
 *     Сформировать строку:
 *     "1 sheep...2 sheep...3 sheep..." до n.
 *
 *  📌 Гарантия:
 *     num ≥ 0.
 *
 *  ⚡ Решение:
 *     Используем StringBuilder для эффективной конкатенации.
 *
 *  📈 Сложность: O(n) время | O(n) память
 *
 */
public final class IfYouCantSleepJustCountSheep {

    private IfYouCantSleepJustCountSheep() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Формирует строку подсчёта овец.
     *
     * @param num количество овец
     * @return строка подсчёта
     */
    public static String countingSheep(final int num) {

        if (num == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            sb.append(i)
                    .append(" sheep...");
        }

        return sb.toString();
    }
}