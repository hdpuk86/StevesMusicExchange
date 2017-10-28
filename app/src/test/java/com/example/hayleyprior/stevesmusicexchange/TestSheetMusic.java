package com.example.hayleyprior.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 28/10/2017.
 */

public class TestSheetMusic {

    SheetMusic music;

    @Before
    public void setUp() throws Exception {
        music = new SheetMusic(8.00, 20.00);
    }

    @Test
    public void calculateMarkUp() throws Exception {
        assertEquals(12.00, music.calculateMarkUp(), 0.1);
    }
}
