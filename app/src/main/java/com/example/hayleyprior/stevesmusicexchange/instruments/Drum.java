package com.example.hayleyprior.stevesmusicexchange.instruments;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Playable;
import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class Drum extends Instrument {

    public Drum(Type type, String brand, String model, String colour, double buyPrice, double sellPrice) {
        super(type, brand, model, colour, buyPrice, sellPrice);
    }

    @Override
    public String play() {
        return "Badum tish";
    }
}
