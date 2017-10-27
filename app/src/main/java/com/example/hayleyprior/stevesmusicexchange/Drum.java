package com.example.hayleyprior.stevesmusicexchange;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class Drum extends Instrument implements Playable, Sellable {

    private double buyPrice;
    private double sellPrice;

    public Drum(Type type, String colour, double buyPrice, double sellPrice) {
        super(type, colour);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    @Override
    public String play() {
        return "Badum tish";
    }

    @Override
    public double calculateMarkUp() {
        return sellPrice - buyPrice;
    }
}
