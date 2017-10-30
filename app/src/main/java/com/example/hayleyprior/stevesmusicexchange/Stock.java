package com.example.hayleyprior.stevesmusicexchange;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

import java.util.ArrayList;

/**
 * Created by hayleyprior on 30/10/2017.
 */

public class Stock {

    private ArrayList<Sellable> stock;

    public Stock() {
        this.stock = new ArrayList<>();
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addStock(Sellable sellable) {
        this.stock.add(sellable);
    }

    public void removeStock(Sellable sellable) {
        this.stock.remove(sellable);
    }

    public double calculateProfits() {
        double profit = 0;
        for(Sellable sellable : this.stock) {
            profit += sellable.calculateMarkUp();
        }
        return profit;
    }

}
