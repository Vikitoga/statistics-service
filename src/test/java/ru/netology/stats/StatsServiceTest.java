package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private static int[] salesForYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService sales = new StatsService();

    @Test
    void shouldSumOfSales() {
        int actual = sales.sumOfSales(salesForYear);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageOfSales() {
        int actual = sales.averageOfSales(salesForYear);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        int actual = sales.maxSales(salesForYear);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        int actual = sales.minSales(salesForYear);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountOfSalesUnderAverage() {
        int actual = sales.countOfSalesUnderAverage(salesForYear);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountOfSalesOverAverage() {
        int actual = sales.countOfSalesOverAverage(salesForYear);
        int expected = 5;
        assertEquals(expected, actual);
    }
}