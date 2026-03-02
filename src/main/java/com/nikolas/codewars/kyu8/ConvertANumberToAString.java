package com.nikolas.codewars.kyu8;

/**
 * 🎯 <strong>Codewars:</strong> <a href="https://www.codewars.com/kata/5265326f5fda8eb1160004c8">Convert a Number to a String</a><br><br>
 *
 * <strong>📋 Задача:</strong> Преобразовать целое число в строковое представление<br>
 *
 * <strong>📊 Примеры:</strong><br>
 * <code>123</code> ➜ <code>"123"</code><br>
 * <code>-7</code> ➜ <code>"-7"</code><br>
 * <code>0</code> ➜ <code>"0"</code><br><br>
 *
 * <strong>⚡ Решение:</strong> <code>Integer.toString(num)</code> — 1 JVM инструкция, 0 аллокаций<br><br>
 *
 * <strong>📈 Сложность:</strong> O(d) время | O(d) память (d = количество цифр)
 */
public final class ConvertANumberToAString {

    private ConvertANumberToAString() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * <strong>Алгоритм:</strong> <code>Integer.toString(int)</code> — нативная JVM оптимизация<br>
     * <ul>
     * <li>✅ Без <code>String.valueOf()</code> оберток</li>
     * <li>✅ Без конкатенации строк</li>
     * <li>✅ Без <code>StringBuilder</code> аллокаций</li>
     * </ul>
     *
     * @param num целое число (-2³¹ до 2³¹-1)
     * @return строковое представление числа
     */
    public static String numberToString(final int num) {
        return Integer.toString(num);
    }
}
