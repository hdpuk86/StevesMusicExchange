package com.example.hayleyprior.stevesmusicexchange.instruments;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Playable;
import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

/**
 * Created by hayleyprior on 28/10/2017.
 */

public class Trumpet extends Instrument implements Playable, Sellable {

    private double buyPrice;
    private double sellPrice;

    public Trumpet(Type type, String brand, String model, String colour, double buyPrice, double sellPrice) {
        super(type, brand, model, colour);
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
    public String play() {
        return "Toot toot";
    }

    @Override
    public double calculateMarkUp() {
        return sellPrice - buyPrice;
    }
}
