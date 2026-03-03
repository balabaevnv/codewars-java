<div align="center">

# Codewars Java Solutions

[![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9-C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![JUnit5](https://img.shields.io/badge/JUnit-5.11-25A162?logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![CI](https://github.com/balabaevnv/codewars-java/actions/workflows/ci.yml/badge.svg)](https://github.com/balabaevnv/codewars-java/actions)

Решения задач [Codewars](https://www.codewars.com/) на Java 21 — каждое с оценкой сложности, обоснованием выбора алгоритма и параметризованными тестами.

</div>
---

## Решения

| Уровень | Решено | Папка |
|:-------:|:------:|-------|
| 8 kyu |   37   | [src/main/java/.../kyu8/](src/main/java/com/nikolas/codewars/kyu8/) |

Каждый файл содержит Javadoc с условием задачи, ссылкой на Codewars, описанием алгоритма и оценкой Big-O.

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
```

---

## Структура проекта

```text
codewars-java/
├── pom.xml
├── .gitignore
├── README.md
├── .github/workflows/ci.yml
└── src/
    ├── main/java/com/nikolas/codewars/
    │   ├── kyu8/       ← 8 kyu решения
    └── test/java/com/nikolas/codewars/
        ├── kyu8/       ← 8 kyu тесты 
```
---

## Стек технологий

| Категория | Технология | Версия |
|-----------|-----------|--------|
| Язык | Java (LTS) | 21 |
| Сборка | Apache Maven | 3.9 |
| Тестирование | JUnit Jupiter | 5.11 |
| Утверждения | AssertJ | 3.27 |
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

