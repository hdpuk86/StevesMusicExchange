package com.example.hayleyprior.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static com.example.hayleyprior.stevesmusicexchange.Type.STRING;
import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class TestGuitar {

    Guitar acousticGuitar;
    Guitar electricGuitar;

    @Before
    public void before() {
        electricGuitar = new Guitar(STRING, "Pink", 43.50, 120.99, 6, true);
        acousticGuitar = new Guitar(STRING, "Brown", 39.00, 100.00, 6, false);
    }

    @Test
    public void playElectric() {
        assertEquals("Neoww", electricGuitar.play());
    }

    @Test
    public void playAcoustic() {
        assertEquals("Strum", acousticGuitar.play());
    }

    @Test
    public void getMarkUp() {
        assertEquals(77.49, electricGuitar.calculateMarkUp(), 0.1);
    }

}
