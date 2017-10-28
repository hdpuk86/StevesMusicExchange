package com.example.hayleyprior.stevesmusicexchange;

import com.example.hayleyprior.stevesmusicexchange.instruments.Piano;

import org.junit.Before;
import org.junit.Test;

import static com.example.hayleyprior.stevesmusicexchange.instruments.Type.KEYBOARD;
import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 28/10/2017.
 */

public class TestPiano {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(KEYBOARD, "Bechstein", "B200", "Black", 2000.00, 8000.00);
    }

    @Test
    public void canPlay() throws Exception {
        assertEquals("Plink", piano.play());
    }

    @Test
    public void calculateMarkUp() throws Exception {
        assertEquals(6000.00, piano.calculateMarkUp(), 0.1);
    }
}
