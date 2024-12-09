package main;

import java.util.List;

public class AverageCalculator {
    public double calculateAverage(List<Double> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не может быть пустым");
        }

        double sum = 0;
        for (Double num : list) {
            sum += num;
        }
        return sum / list.size();
    }
}
