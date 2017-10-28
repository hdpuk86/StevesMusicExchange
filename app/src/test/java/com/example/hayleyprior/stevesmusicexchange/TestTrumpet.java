package com.example.hayleyprior.stevesmusicexchange;

import com.example.hayleyprior.stevesmusicexchange.instruments.Trumpet;

import org.junit.Before;
import org.junit.Test;

import static com.example.hayleyprior.stevesmusicexchange.instruments.Type.BRASS;
import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 28/10/2017.
 */

public class TestTrumpet {

    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet(BRASS, "Yamaha", "5524", "Silver", 40.00, 80.00);
    }

    @Test
    public void canPlay() throws Exception {
        assertEquals("Toot toot", trumpet.play());
    }

    @Test
    public void calculateMarkUp() {
        assertEquals(40.00, trumpet.calculateMarkUp(), 0.1);
    }
}
