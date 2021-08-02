package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void shouldSumAllSales() {
        MyService service = new MyService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.sumAllSales(sales);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAverage() {
        MyService servic = new MyService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = servic.average(sales);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxMonth() {
        MyService service = new MyService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.maxSales(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinMonth() {
        MyService service = new MyService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.minSales(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderAverageSale() {
        MyService service = new MyService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.underAverageSale(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldOverAverageSale() {
        MyService service = new MyService();
        int [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.overAverageSale(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}