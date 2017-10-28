package com.example.hayleyprior.stevesmusicexchange;

import java.util.ArrayList;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class Shop {

    private ArrayList<Sellable> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<Sellable> getStock() {
        return this.stock;
    }

    public void addStock(Sellable sellable) {
        stock.add(sellable);
    }

    public void removeStock(Sellable sellable) {
        stock.remove(sellable);
    }

    public double calculateProfits() {
        double profit = 0;
        for(Sellable sellable : this.stock) {
            double markUp = sellable.calculateMarkUp();
            profit += markUp;
        }
        return profit;
    }

}
