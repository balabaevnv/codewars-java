package com.nikolas.codewars.kyu8;

/**
 * Codewars:
 * <a href="https://www.codewars.com/kata/55685cd7ad70877c23000102">Return Negative</a>
 *
 * <p>Делает число отрицательным. Если уже отрицательное — не изменяет.</p>
 */
public final class ReturnNegative {

    private ReturnNegative() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * O(1) время, O(1) память — одно сравнение, одно отрицание
     *
     * <p>Безопасен для всех значений {@code int}, включая
     * {@link Integer#MIN_VALUE} — без переполнений.</p>
     *
     * @param x целое число
     * @return отрицательное значение (или 0 для нуля)
     */
    public static int makeNegative(final int x) {
        // Если положительное — инвертируем знак, иначе — возвращаем как есть
        return x > 0 ? -x : x;
    }
}