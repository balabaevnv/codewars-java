package com.nikolas.codewars.kyu8;

import java.util.ArrayList;
import java.util.List;

/**
 * Codewars Kata
 * Unfinished Loop - Bug Fixing #1
 *
 * 🔗 https://www.codewars.com/kata/55c28f7304e3eaebef0000da/train/java
 *
 * Pattern:
 * Loop Progression Bug
 *
 * Ошибка:
 * переменная цикла не увеличивалась → infinite loop.
 *
 * Решение:
 * добавить count++ в for loop.
 *
 * Сложность:
 * Time  : O(n)
 * Memory: O(n)
 */
public final class UnfinishedLoopBugFixing1 {

    private UnfinishedLoopBugFixing1() {}

    public static List<Integer> CreateList(int number) {

        // Подождите, дайте проверю...
        // ArrayList создается сразу нужного размера
        List<Integer> list = new ArrayList<>(number);

        // О, я упустил — переменная count должна увеличиваться
        for (int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }
}