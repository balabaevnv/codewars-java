package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata: Neutralisation
 *
 * 🔗 https://www.codewars.com/kata/65128732b5aff40032a3d8f0/train/java
 *
 * Pattern: Посимвольное преобразование, char[] для скорости
 *
 * Complexity:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class Neutralisation {

    private Neutralisation() {}

    /**
     * Возвращает строку взаимодействия двух строк из '+' и '-'.
     *
     * @param s1 первая строка (только '+' и '-')
     * @param s2 вторая строка (только '+' и '-'), длина равна s1.length()
     * @return результирующая строка, где одинаковые символы остаются,
     *         разные заменяются на '0'
     */
    public static String neutralise(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return "";
        }
        char[] result = new char[s1.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (s1.charAt(i) == s2.charAt(i)) ? s1.charAt(i) : '0';
        }
        return new String(result);
    }
}