package com.example.hayleyprior.stevesmusicexchange;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class Guitar extends Instrument implements Playable, Sellable {

    private double buyPrice;
    private double sellPrice;
    private int strings;
    private boolean electric;

    public Guitar(Type type, String colour, double buyPrice, double sellPrice, int strings, boolean electric) {
        super(type, colour);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.strings = strings;
        this.electric = electric;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public int getStrings() {
        return this.strings;
    }

    public boolean isElectric() {
        return this.electric;
    }

    @Override
    public String play() {
        if (isElectric()) {
            return "Neoww";
        }
        return "Strum";
    }

    @Override
    public double calculateMarkUp() {
        return sellPrice - buyPrice;
    }
}
