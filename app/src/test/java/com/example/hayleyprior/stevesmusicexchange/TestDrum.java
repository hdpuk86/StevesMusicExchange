package com.example.hayleyprior.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static android.R.attr.type;
import static android.icu.lang.UCharacter.JoiningGroup.PE;
import static com.example.hayleyprior.stevesmusicexchange.Type.PERCUSSION;
import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 27/10/2017.
 */

public class TestDrum {

    Drum drum;

    @Before
    public void before() {
        drum = new Drum(PERCUSSION, "White", 50.00, 180.00);
    }

    @Test
    public void getType() {
        assertEquals(Type.PERCUSSION, drum.getType());
    }

    @Test
    public void getColour() {
        assertEquals("White", drum.getColour());
    }

    @Test
    public void drumCanPlay() {
        assertEquals("Badum tish", drum.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(130.00, drum.calculateMarkUp(), 0.1);
    }
}
