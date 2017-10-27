package com.example.hayleyprior.stevesmusicexchange;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class Piano extends Instrument implements Playable, Sellable {

    public Piano(Type type, String colour) {
        super(type, colour);
    }

    @Override
    public String play() {
        return null;
    }

    @Override
    public double calculateMarkUp() {
        return 0;
    }
}
