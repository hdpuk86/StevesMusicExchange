package com.example.hayleyprior.stevesmusicexchange.instruments;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public abstract class Instrument {

    private String colour;
    private Type type;
    private String model;
    private String brand;

    public Instrument(Type type, String brand, String model, String colour) {
        this.colour = colour;
        this.type = type;
        this.brand = brand;
        this.model = model;
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

}
