package com.example.hayleyprior.stevesmusicexchange;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

import java.util.ArrayList;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class Shop {

    private Stock stockList;
    private String name;

    public Shop(String name, Stock stockList) {
        this.name = name;
        this.stockList = stockList;
    }

    public String getName() {
        return this.name;
    }

    public int countStock() {
        return this.stockList.countStock();
    }

    public void addStock(Sellable sellable) {
        this.stockList.addStock(sellable);
    }

    public void removeStock(Sellable sellable) {
        this.stockList.removeStock(sellable);
    }

    public double calculateProfits() {
        return this.stockList.calculateProfits();
    }

}
