package com.example.hayleyprior.stevesmusicexchange;

import com.example.hayleyprior.stevesmusicexchange.equipment.Drumsticks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 28/10/2017.
 */

public class TestDrumsticks {

    Drumsticks drumsticks;

    @Before
    public void setUp() throws Exception {
        drumsticks = new Drumsticks(5.00, 30.00);
    }

    @Test
    public void calculateMarkUp() throws Exception {
        assertEquals(25, drumsticks.calculateMarkUp(), 0.1);
    }
}
