package test;

import main.AverageComparison;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AverageComparisonTest {

    @Test
    public void testCompareAveragesFirstListGreater() {
        AverageComparison comparison = new AverageComparison();
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(1.0, 1.0, 1.0);

        String result = comparison.compareAverages(list1, list2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAveragesSecondListGreater() {
        AverageComparison comparison = new AverageComparison();
        List<Double> list1 = Arrays.asList(1.0, 1.0, 1.0);
        List<Double> list2 = Arrays.asList(2.0, 3.0, 4.0);

        String result = comparison.compareAverages(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAveragesEqual() {
        AverageComparison comparison = new AverageComparison();
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(3.0, 2.0, 1.0);

        String result = comparison.compareAverages(list1, list2);

        assertEquals("Средние значения равны", result);
    }

    @Test
    public void testEmptyList() {
        AverageComparison comparison = new AverageComparison();

        assertThrows(IllegalArgumentException.class, () ->
                comparison.compareAverages(Arrays.asList(), Arrays.asList(1.0, 2.0))
        );
    }

    @Test
    public void testNullList() {
        AverageComparison comparison = new AverageComparison();

        assertThrows(IllegalArgumentException.class, () ->
                comparison.compareAverages(null, Arrays.asList(1.0, 2.0))
        );
    }
}
