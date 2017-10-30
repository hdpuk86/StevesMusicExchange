package com.example.hayleyprior.stevesmusicexchange.instruments;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Playable;
import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public abstract class Instrument implements Sellable, Playable {

    private String colour;
    private Type type;
    private String model;
    private String brand;
    private double buyPrice;
    private double sellPrice;

    Instrument(Type type, String brand, String model, String colour, double buyPrice, double sellPrice) {
        this.colour = colour;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public double getBuyPrice() {
        return buyPrice;
    }

    @Override
    public double getSellPrice() {
        return sellPrice;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return getBrand() + " " + getModel();
    }

    public String getColour() {
        return this.colour;
    }

    public Type getType() {
        return this.type;
    }

    public abstract String play();

    @Override
    public double calculateMarkUp() {
        return getSellPrice() - getBuyPrice();
    }
}
