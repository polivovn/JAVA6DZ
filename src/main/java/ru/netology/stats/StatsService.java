package ru.netology.stats;
        
public class StatsService {
    public long amount(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales += sale;

        }
        return allSales;
    }

    public long average(long[] sales) {

        return amount(sales) / sales.length;
    }

    public int maximumMonth(long[] sales) {
        int monthMaximumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximumSale]) {
                monthMaximumSale = i;
            }
        }
        return monthMaximumSale + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        Long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;


            }
        }
        return counter;
    }
}