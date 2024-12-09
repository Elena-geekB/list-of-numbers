package main;

import java.util.List;

public class AverageComparison {
    private final AverageCalculator calculator;

    public AverageComparison() {
        this.calculator = new AverageCalculator();
    }

    public String compareAverages(List<Double> list1, List<Double> list2) {
        double average1 = calculator.calculateAverage(list1);
        double average2 = calculator.calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
