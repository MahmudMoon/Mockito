package com.example.moon.mockito.stock_market;

import java.util.ArrayList;
import java.util.List;

public class Stock_Data {
    StockService stockService;
    List<Stock> stocks = new ArrayList<>();



    public Stock_Data(StockService stockService , ArrayList<Stock> arrayList) {
        this.stockService = stockService;
        stocks = arrayList;

    }

    public int getTotalMarketPrice(){
        int total_price = 0;
        for (Stock stock:stocks ) {
            total_price+=stockService.getPrice(stock);
        }
        return total_price;
    }

}
