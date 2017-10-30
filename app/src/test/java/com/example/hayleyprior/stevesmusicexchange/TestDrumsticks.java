package com.example.hayleyprior.stevesmusicexchange;

import com.example.hayleyprior.stevesmusicexchange.equipment.Drumstick;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 28/10/2017.
 */

public class TestDrumsticks {

    Drumstick drumsticks;

    @Before
    public void setUp() throws Exception {
        drumsticks = new Drumstick(5.00, 30.00);
    }

    @Test
    public void calculateMarkUp() throws Exception {
        assertEquals(25, drumsticks.calculateMarkUp(), 0.1);
    }
}
