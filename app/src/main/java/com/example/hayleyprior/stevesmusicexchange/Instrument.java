package com.example.hayleyprior.stevesmusicexchange;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public abstract class Instrument {

    private String colour;
    private Type type;

    public Instrument(Type type, String colour) {
        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return this.colour;
    }

    public Type getType() {
        return this.type;
    }

}
