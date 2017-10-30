package com.example.hayleyprior.stevesmusicexchange.instruments;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Playable;
import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class Guitar extends Instrument {

    private int strings;
    private boolean electric;

    public Guitar(Type type, String brand, String model, String colour, double buyPrice, double sellPrice, int strings, boolean electric) {
        super(type, brand, model, colour, buyPrice, sellPrice);
        this.strings = strings;
        this.electric = electric;
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

    public String amplify() {
        if(isElectric()) {
            return play().toUpperCase();
        }
        return "Cannot amplify";
    }
}