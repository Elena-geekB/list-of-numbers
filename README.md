# list-of-numbers

## Описание
Этот проект реализует программу для сравнения средних значений двух списков чисел. Программа включает в себя следующие компоненты:

- **AverageCalculator** — класс, который вычисляет среднее значение списка чисел.
- **AverageComparison** — класс, который использует `AverageCalculator` для сравнения средних значений двух списков и возвращает результат сравнения.
- **main.Main** — точка входа в программу, которая демонстрирует использование классов для сравнения средних значений.
- **AverageComparisonTest** — набор тестов для проверки правильности работы логики сравнения средних значений.

## Структура проекта
- `main/AverageCalculator.java` — класс для вычисления среднего значения.
- `main/AverageComparison.java` — класс для сравнения средних значений.
- `main.Main.java` — точка входа в программу для демонстрации работы.
- `test/AverageComparisonTest.java` — тесты для проверки работы программы.

## Зависимости
Для запуска и тестирования проекта необходимо иметь установленную Java (версия 8 или выше).

## Как запустить
1. Склонируйте репозиторий на вашу локальную машину.
2. Скомпилируйте проект с помощью Maven:
```
mvn install
```
3. Запустите программу:
```
mvn exec:java
```
## Как провести тестирование
Тесты для проекта находятся в файле test/AverageComparisonTest.java. Для их запуска выполните следующую команду:
```
mvn clean test jacoco:report
```
После завершения тестов отчет будет доступен в папке target/site/jacoco.

## Пример использования
Пример входных данных и результатов выполнения программы:
```
Списки: [10, 20, 30] и [5, 15, 25]
Среднее значение первого списка: 20.0
Среднее значение второго списка: 15.0
Результат сравнения: Первое среднее значение больше.
```
