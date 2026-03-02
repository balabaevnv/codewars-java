package com.nikolas.codewars.kyu8;

/**
 * Codewars:
 * <a href="https://www.codewars.com/kata/53369039d7ab3ac506000467">Convert boolean values to strings 'Yes' or 'No</a>
 *
 * <p>Возвращает "Yes" для {@code true}, "No" для {@code false}</p>
 */
public final class ConvertBooleanValuesToStringsYesOrNo {

    private ConvertBooleanValuesToStringsYesOrNo() {
        throw new UnsupportedOperationException("Утилитарный класс");
    }

    /**
     * O(1) время, O(1) память
     * <p>Строковые литералы берутся из String Pool — нулевые аллокации.</p>
     *
     * @param b булево значение
     * @return "Yes" или "No"
     */
    public static String boolToWord(final boolean b) {
        // Один тернарный оператор — одна инструкция ветвления
        return b ? "Yes" : "No";
    }
}