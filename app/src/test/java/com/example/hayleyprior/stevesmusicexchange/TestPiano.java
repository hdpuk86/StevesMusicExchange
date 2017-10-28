package com.example.hayleyprior.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static com.example.hayleyprior.stevesmusicexchange.Type.KEYBOARD;
import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 28/10/2017.
 */

public class TestPiano {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(KEYBOARD, "Black", 500.00, 1300.00);
    }

    @Test
    public void canPlay() throws Exception {
        assertEquals("Plink", piano.play());
    }

    @Test
    public void calculateMarkUp() throws Exception {
        assertEquals(800.00, piano.calculateMarkUp(), 0.1);
    }
}
