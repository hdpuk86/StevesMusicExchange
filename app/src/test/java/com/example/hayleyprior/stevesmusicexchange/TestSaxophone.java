package com.example.hayleyprior.stevesmusicexchange;

import com.example.hayleyprior.stevesmusicexchange.instruments.Saxophone;

import org.junit.Before;
import org.junit.Test;

import static com.example.hayleyprior.stevesmusicexchange.instruments.Type.WOODWIND;
import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 28/10/2017.
 */

public class TestSaxophone {

    Saxophone saxophone;

    @Before
    public void setUp() throws Exception {
        saxophone = new Saxophone(WOODWIND, "Selmer", "Alto", "Gold", 100.00, 300.00);
    }

    @Test
    public void canPlay() throws Exception {
        assertEquals("Pffer der der!", saxophone.play());
    }

    @Test
    public void calculateMarkUp() throws Exception {
        assertEquals(200.00, saxophone.calculateMarkUp(), 0.2);
    }
}
