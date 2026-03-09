package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Multiplication Table for Number
 *
 * 🔗 https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce/train/java
 *
 * Pattern:
 * Formatted Sequence Generation
 *
 * Условие:
 * Сгенерировать таблицу умножения для числа от 1 до 10.
 *
 * Формат строки:
 * i * num = result
 *
 * Между строками используется '\n', но
 * последняя строка не должна содержать '\n'.
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class MultiplicationTableForNumber {

    private MultiplicationTableForNumber() {}

    public static String multiTable(int num) {

        // Подождите, дайте проверю...
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {

            sb.append(i)
                    .append(" * ")
                    .append(num)
                    .append(" = ")
                    .append(i * num);

            // О, я упустил — последняя строка не должна иметь \n
            if (i < 10) {
                sb.append('\n');
            }
        }

        return sb.toString();
    }
}