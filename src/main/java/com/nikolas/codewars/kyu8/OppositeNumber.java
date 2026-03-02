package com.nikolas.codewars.kyu8;

/**
 * Codewars:
 * <a href="https://www.codewars.com/kata/56dec885c54a926dcd001095">Opposite number</a>
 *
 * <p>Возвращает противоположное число (аддитивную инверсию).</p>
 */
public final class OppositeNumber {

    private OppositeNumber() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * Время:  O(1) — одна машинная инструкция NEG
     * Память: O(1) — ноль аллокаций, результат на стеке
     *
     * <p>Унарный минус — прямая трансляция в инструкцию {@code ineg}
     * на уровне байткода JVM. Без вызовов методов, без объектов,
     * без ветвлений.</p>
     *
     * @param number целое число
     * @return противоположное число (аддитивная инверсия)
     */
    public static int opposite(final int number) {
        // Унарный минус — одна инструкция процессора
        return -number;
    }
}