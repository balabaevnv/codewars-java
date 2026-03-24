package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Basic Subclasses Adam And Eve
 *
 * 🔗 https://www.codewars.com/kata/547274e24481cfc469000416/train/java
 *
 * Pattern:
 * OOP inheritance + factory method
 *
 * Complexity:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class BasicSubclassesAdamAndEve {

    private BasicSubclassesAdamAndEve() {}

    public static Human[] create(){

        // Подождите, дайте проверю…
        Human[] result = new Human[2];

        // О, я упустил… нужно создать правильные типы
        result[0] = new Man();
        result[1] = new Woman();

        return result;
    }
}

// Базовый класс
class Human {
    // пустой — по условию достаточно
}

// Наследники
class Man extends Human {
}

class Woman extends Human {
}