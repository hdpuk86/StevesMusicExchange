package com.example.hayleyprior.stevesmusicexchange;

import com.example.hayleyprior.stevesmusicexchange.instruments.Guitar;

import org.junit.Before;
import org.junit.Test;

import static com.example.hayleyprior.stevesmusicexchange.instruments.Type.STRING;
import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class TestGuitar {

    private Guitar acousticGuitar;
    private Guitar electricGuitar;

    @Before
    public void before() {
        electricGuitar = new Guitar(STRING, "Fender", "Squier", "Pink", 80.80, 229.99, 6, true);
        acousticGuitar = new Guitar(STRING, "Fender", "Classic", "Brown", 39.00, 100.00, 6, false);
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
        assertEquals(149.19, electricGuitar.calculateMarkUp(), 0.1);
    }

    @Test
    public void canAmplifyElectric() {
        assertEquals("NEOWW", electricGuitar.amplify());
    }

    @Test
    public void cannotAmplifyAcoustic() {
        assertEquals("Cannot amplify", acousticGuitar.amplify());
    }

}
