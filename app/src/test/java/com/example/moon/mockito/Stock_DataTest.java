package com.example.moon.mockito;

import com.example.moon.mockito.stock_market.Stock;
import com.example.moon.mockito.stock_market.StockService;
import com.example.moon.mockito.stock_market.Stock_Data;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Stock_DataTest {
    Stock_Data stock_data = null;
    StockService stockService = null;
    ArrayList<Stock> stocks = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        stockService = mock(StockService.class);
        Stock google = new Stock(1,10,"google");
        Stock microsoft = new Stock(2,20,"microsoft");
        stocks.add(google);
        stocks.add(microsoft);
        when(stockService.getPrice(google)).thenReturn(50);
        when(stockService.getPrice(microsoft)).thenReturn(50);
    }

    @Test
    public void EnsureTotalPrice(){
        stock_data = new Stock_Data(stockService,stocks);
        int actual_price = stock_data.getTotalMarketPrice();
        int expected_price = 100;
        assertEquals(expected_price,actual_price,1.00);
    }

    @After
    public void tearDown() throws Exception {
    }
}