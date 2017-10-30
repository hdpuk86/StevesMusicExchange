package com.example.hayleyprior.stevesmusicexchange.equipment;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

/**
 * Created by hayleyprior on 30/10/2017.
 */

public abstract class Equipment implements Sellable{

    private double buyPrice;
    private double sellPrice;

    public Equipment(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public double getBuyPrice() {
        return this.buyPrice;
    }

    @Override
    public double getSellPrice() {
        return this.sellPrice;
    }

    @Override
    public double calculateMarkUp() {
        return getSellPrice() - getBuyPrice();
    }
}
