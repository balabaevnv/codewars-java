<div align="center">

# Codewars Java Solutions

[![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9-C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![JUnit5](https://img.shields.io/badge/JUnit-5.11-25A162?logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![CI](https://github.com/balabaevnv/codewars-java/actions/workflows/ci.yml/badge.svg)](https://github.com/balabaevnv/codewars-java/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

Решения задач [Codewars](https://www.codewars.com/) на Java 21 — каждое с оценкой сложности, обоснованием выбора алгоритма и параметризованными тестами.

</div>
---

## Решения

### 8 kyu

| # | Задача | Время | Память | Алгоритм | Тесты |
|--:|--------|:-----:|:------:|----------|:-----:|
| 1 | [Even or Odd](https://www.codewars.com/kata/53da3dbb4a5168369a0000fe) | O(1) | O(1) | `number & 1` — побитовая проверка LSB | 8 |
| 2 | [Reversed Strings](https://www.codewars.com/kata/5168bb5dfe9a00b126000018) | O(n) | O(n) | `StringBuilder.reverse()` — Unicode-safe | 5 |
| 3 | [Convert Number to String](https://www.codewars.com/kata/5265326f5fda8eb1160004c8) | O(d) | O(d) | `Integer.toString()` — прямой вызов без обёрток | 6 |
| 4 | [Return Negative](https://www.codewars.com/kata/55685cd7ad70877c23000102) | O(1) | O(1) | `x > 0 ? -x : x` — без overflow через Math.abs | 7 |
| 5 | [Boolean to String](https://www.codewars.com/kata/53369039d7ab3ac506000467) | O(1) | O(1) | `b ? "Yes" : "No"` — литералы из String Pool | 4 |
| 6 | [Sum of Positive](https://www.codewars.com/kata/5715eaedb436cf5606000381) | O(n) | O(1) | `for-each` с аккумулятором, 0 аллокаций | 9 |
| 7 | [Opposite Number](https://www.codewars.com/kata/56dec885c54a926dcd001095) | O(1) | O(1) | `-number` — одна инструкция `ineg` | 6 |

**7 задач · 45 тестов · Java 21 · JUnit 5 · AssertJ**
---

## Быстрый старт

**Требования:** Java 21+, Maven 3.9+

```bash
git clone https://github.com/balabaevnv/codewars-java.git
cd codewars-java

# Запустить все тесты
mvn clean test

# Запустить тесты одного класса
mvn test -Dtest=EvenOrOddTest

# Собрать проект
mvn clean package
```
---

## Структура проекта

```text
codewars-java/
├── pom.xml
├── README.md
├── LICENSE
├── .github/
│   └── workflows/
│       └── ci.yml
├── src/
│   ├── main/java/com/nikolas/codewars/
│   │   └── kyu8/
│   │       ├── EvenOrOdd.java
│   │       ├── ReversedStrings.java
│   │       ├── ConvertANumberToAString.java
│   │       ├── ReturnNegative.java
│   │       ├── ConvertBooleanValuesToStringsYesOrNo.java
│   │       ├── SumOfPositive.java
│   │       └── OppositeNumber.java
│   └── test/java/com/nikolas/codewars/
│       └── kyu8/
│           └── *Test.java
```
---

## Стек технологий

| Категория | Технология | Версия |
|-----------|-----------|--------|
| Язык | Java (LTS) | 21 |
| Сборка | Apache Maven | 3.9 |
| Тестирование | JUnit Jupiter | 5.11 |
| Утверждения | AssertJ | 3.27 |
| Логирование | SLF4J + Logback | 2.0 / 1.5 |
| CI/CD | GitHub Actions | JDK 21 Temurin |

---

## Принципы

- **Utility class** — final класс, private конструктор, static методы
- **Обоснование алгоритма** — в Javadoc объяснено, почему выбран этот подход
- **Big-O в документации** — время и память указаны в Javadoc каждого метода
- **Граничные случаи** — 0, отрицательные, MAX_VALUE, MIN_VALUE, пустой вход
- **Параметризованные тесты** — @CsvSource / @MethodSource покрывают все сценарии

---

## CI/CD

При каждом push в main GitHub Actions автоматически запускает:

```text
Checkout → Setup JDK 21 (Temurin) → Cache ~/.m2 → mvn test
```

Статус: [![CI](https://github.com/balabaevnv/codewars-java/actions/workflows/ci.yml/badge.svg)](https://github.com/balabaevnv/codewars-java/actions)

---

## Автор

**Николай Балабаев** — Java-разработчик, Воронеж

| | |
|---|---|
| Telegram | [@N_1_k_o_l_a_s](https://t.me/N_1_k_o_l_a_s) |
| Email | [velikii.y4itel@gmail.com](mailto:velikii.y4itel@gmail.com) |
| GitHub | [balabaevnv](https://github.com/balabaevnv) |
| Codewars | [M_ass_TER](https://www.codewars.com/users/M_ass_TER) |

---

## Лицензия

[MIT](LICENSE) — свободное использование, копирование, модификация.