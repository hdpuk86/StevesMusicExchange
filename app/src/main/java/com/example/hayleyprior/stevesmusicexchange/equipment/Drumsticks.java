package com.example.hayleyprior.stevesmusicexchange.equipment;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class Drumsticks implements Sellable {

    private double sellPrice;
    private double buyPrice;

    public Drumsticks(double buyPrice, double sellPrice) {
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    @Override
    public double calculateMarkUp() {
        return this.sellPrice - this.buyPrice;
    }
}
