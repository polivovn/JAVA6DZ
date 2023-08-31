
package ru.netology.services;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import ru.netology.stats.StatsService;

class StatsServiceTest {
    @Test
    public void testAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.amount(sales);
        long expected = 180;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average (sales);
        long expected = (180) / 12;
        Assertions.assertEquals (expected, actual);
    }
    @Test
    public void testMaxinun() {
    StatsService service = new StatsService();
    long[] sales = {180};
    long actual = service.maximumMonth(sales);
        long expected = 8;
        Assertions.assertEquals (expected, actual);
        }


    @Test
    public void testBellowAverage() {
        StatsService service = new StatsService();
        long[] sales = {180};
        long actual = service.monthBellowAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
