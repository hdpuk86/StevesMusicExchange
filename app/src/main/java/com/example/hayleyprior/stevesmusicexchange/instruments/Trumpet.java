package com.example.hayleyprior.stevesmusicexchange.instruments;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Playable;
import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

/**
 * Created by hayleyprior on 28/10/2017.
 */

public class Trumpet extends Instrument {


    public Trumpet(Type type, String brand, String model, String colour, double buyPrice, double sellPrice) {
        super(type, brand, model, colour, buyPrice, sellPrice);
    }

    @Override
    public String play() {
        return "Toot toot";
    }

}
