package test;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;

import main.AverageComparison;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@Story("Average Comparison Tests")
public class AverageComparisonTest {

    @Test
    @DisplayName("First list has a greater average")
    @Description("Verify that the first list has a greater average value than the second list.")
    public void testCompareAveragesFirstListGreater() {
        AverageComparison comparison = new AverageComparison();
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(1.0, 1.0, 1.0);

        String result = compareAverages(comparison, list1, list2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    @DisplayName("Second list has a greater average")
    @Description("Verify that the second list has a greater average value than the first list.")
    public void testCompareAveragesSecondListGreater() {
        AverageComparison comparison = new AverageComparison();
        List<Double> list1 = Arrays.asList(1.0, 1.0, 1.0);
        List<Double> list2 = Arrays.asList(2.0, 3.0, 4.0);

        String result = compareAverages(comparison, list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    @DisplayName("Both lists have equal averages")
    @Description("Verify that the average values of both lists are equal.")
    public void testCompareAveragesEqual() {
        AverageComparison comparison = new AverageComparison();
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(3.0, 2.0, 1.0);

        String result = compareAverages(comparison, list1, list2);

        assertEquals("Средние значения равны", result);
    }

    @Test
    @DisplayName("Empty list throws an exception")
    @Description("Verify that passing an empty list to the comparison throws an exception.")
    public void testEmptyList() {
        AverageComparison comparison = new AverageComparison();

        assertThrows(IllegalArgumentException.class, () ->
                comparison.compareAverages(Arrays.asList(), Arrays.asList(1.0, 2.0))
        );
    }

    @Test
    @DisplayName("Null list throws an exception")
    @Description("Verify that passing a null list to the comparison throws an exception.")
    public void testNullList() {
        AverageComparison comparison = new AverageComparison();

        assertThrows(IllegalArgumentException.class, () ->
                comparison.compareAverages(null, Arrays.asList(1.0, 2.0))
        );
    }

    @Step("Comparing averages for lists: {list1} and {list2}")
    private String compareAverages(AverageComparison comparison, List<Double> list1, List<Double> list2) {
        return comparison.compareAverages(list1, list2);
    }
}
