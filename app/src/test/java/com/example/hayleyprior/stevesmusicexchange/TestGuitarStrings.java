package com.example.hayleyprior.stevesmusicexchange;

import com.example.hayleyprior.stevesmusicexchange.equipment.GuitarStrings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 28/10/2017.
 */

public class TestGuitarStrings {

    GuitarStrings strings;

    @Before
    public void setUp() throws Exception {
        strings = new GuitarStrings(6.00, 12.00);
    }

    @Test
    public void calculateMarkUp() throws Exception {
        assertEquals(6.00, strings.calculateMarkUp(), 0.1);
    }
}
