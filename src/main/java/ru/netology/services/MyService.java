package ru.netology.services;

public class MyService {

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int average(int[] sales) {
//        int average = 0;
//        int sum = 0;
//        for (int sale : sales) {
//            sum = sum + sale;
//        }
        int average = sumAllSales(sales) / sales.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int underAverageSale(int[] sales) { // Месяцы с продажами ниже среднего
        int underAverage = 0;
        for (int sale : sales) {
            if (sale < average(sales)) {
                underAverage += 1;
            }
        }
        return underAverage;
    }

    public int overAverageSale(int[] sales) { // Месяцы с продажами выше среднего
        int overAverage = 0;
        for (int sale : sales) {
            if (sale > average(sales)) {
                overAverage += 1;
            }
        }
        return overAverage;
    }
}
