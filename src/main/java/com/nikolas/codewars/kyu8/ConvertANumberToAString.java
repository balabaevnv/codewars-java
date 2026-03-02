package com.nikolas.codewars.kyu8;

/**
 🎯 Codewars: Convert a Number to a String
 🔗 https://www.codewars.com/kata/5265326f5fda8eb1160004c8

 📋 Задача: int -> String
 📊 Примеры:
 123 -> "123"
 -7  -> "-7"
 0   -> "0"

 ⚡ Решение: Integer.toString(num)
 ⏱️ O(d) время, d=количество цифр
 💾 0 аллокаций (String Pool)

 Почему лучше:
 - Нет String.valueOf() оберток
 - Нет StringBuilder
 - Нет конкатенации "+"
 */
public final class ConvertANumberToAString {

    private ConvertANumberToAString() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     Integer.toString(int) - нативная JVM оптимизация
     Работает с отрицательными, нулём, INT_MIN/MAX

     @param num целое число
     @return строковое представление
     */
    public static String numberToString(final int num) {
        return Integer.toString(num);
    }
}
