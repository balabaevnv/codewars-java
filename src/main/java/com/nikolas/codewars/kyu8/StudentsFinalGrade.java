package com.nikolas.codewars.kyu8;

/**
 * Codewars Kata
 * Students Final Grade
 *
 * 🔗 https://www.codewars.com/kata/5ad0d8356165e63c140014d4/train/java
 *
 * Pattern:
 * Priority Rule Evaluation
 *
 * Правила:
 *
 * 100 → exam > 90 OR projects > 10
 * 90  → exam > 75 AND projects >= 5
 * 75  → exam > 50 AND projects >= 2
 * 0   → иначе
 *
 * Алгоритм:
 * 1. проверяем условия в порядке приоритета
 * 2. возвращаем первое совпадение
 *
 * Сложность:
 * Time  : O(1)
 * Memory: O(1)
 */
public final class StudentsFinalGrade {

    private StudentsFinalGrade() {}

    public static int finalGrade(int exam, int projects) {

        // правило для оценки 100
        if (exam > 90 || projects > 10) {
            return 100;
        }

        // правило для оценки 90
        if (exam > 75 && projects >= 5) {
            return 90;
        }

        // правило для оценки 75
        if (exam > 50 && projects >= 2) {
            return 75;
        }

        // во всех остальных случаях
        return 0;
    }
}