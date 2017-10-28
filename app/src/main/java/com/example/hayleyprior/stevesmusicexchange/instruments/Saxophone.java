package com.example.hayleyprior.stevesmusicexchange.instruments;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Playable;
import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class Saxophone extends Instrument implements Playable, Sellable {

    private double sellPrice;
    private double buyPrice;

    public Saxophone(Type type, String brand, String model, String colour, double buyPrice, double sellPrice) {
        super(type, brand, model, colour);
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    @Override
    public String play() {
        return "Pffer der der!";
    }

    @Override
    public double calculateMarkUp() {
        return this.sellPrice - this.buyPrice;
    }
}
