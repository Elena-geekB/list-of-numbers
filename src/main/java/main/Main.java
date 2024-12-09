package main;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание двух списков для сравнения
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(3.0, 4.0, 5.0);

        // Создание объекта для сравнения
        AverageComparison comparison = new AverageComparison();

        // Сравнение средних значений
        String result = comparison.compareAverages(list1, list2);

        // Вывод результата
        System.out.println(result);
    }
}
