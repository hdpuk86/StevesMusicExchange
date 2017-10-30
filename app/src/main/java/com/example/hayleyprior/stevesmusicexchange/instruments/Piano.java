package com.example.hayleyprior.stevesmusicexchange.instruments;

import com.example.hayleyprior.stevesmusicexchange.interfaces.Playable;
import com.example.hayleyprior.stevesmusicexchange.interfaces.Sellable;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class Piano extends Instrument {


    public Piano(Type type, String brand, String model, String colour, double buyPrice, double sellPrice) {
        super(type, brand, model, colour, buyPrice, sellPrice);
    }

    @Override
    public String play() {
        return "Plink";
    }

}
