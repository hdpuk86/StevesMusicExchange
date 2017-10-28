package com.example.hayleyprior.stevesmusicexchange.equipment;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class GuitarStrings implements Sellable {

    private double buyPrice;
    private double sellPrice;

    public GuitarStrings(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public double calculateMarkUp() {
        return this.sellPrice - this.buyPrice;
    }
}
