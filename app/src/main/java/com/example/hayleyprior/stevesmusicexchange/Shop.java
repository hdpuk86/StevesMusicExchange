package com.example.hayleyprior.stevesmusicexchange;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

import java.util.ArrayList;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class Shop {

    private ArrayList<Sellable> stock;
    private String name;

    public Shop(String name) {
        this.stock = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return this.name;
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

    public int countStock() {return stock.size();}

    public double calculateProfits() {
        double profit = 0;
        for(Sellable sellable : this.stock) {
            double markUp = sellable.calculateMarkUp();
            profit += markUp;
        }
        return profit;
    }

}
