package com.example.hayleyprior.stevesmusicexchange;

import com.example.hayleyprior.stevesmusicexchange.equipment.SheetMusic;
import com.example.hayleyprior.stevesmusicexchange.instruments.Trumpet;

import org.junit.Before;
import org.junit.Test;

import static com.example.hayleyprior.stevesmusicexchange.instruments.Type.BRASS;
import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 30/10/2017.
 */

public class TestStock {

    private Stock stock;
    private Trumpet trumpet;
    private SheetMusic music;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet(BRASS, "Yamaha", "J50", "Gold", 50, 100);
        music = new SheetMusic(10, 20);
        this.stock = new Stock();
        this.stock.addStock(trumpet);
    }


    @Test
    public void canCountStock() {
        assertEquals(1, this.stock.countStock());
    }

    @Test
    public void canAddStock() throws Exception {
        this.stock.addStock(this.music);
        assertEquals(2, this.stock.countStock());
    }

    @Test
    public void canRemoveStock() throws Exception {
        this.stock.removeStock((this.trumpet));
        assertEquals(0, this.stock.countStock());
    }

    @Test
    public void canCalculateProfits() {
        this.stock.addStock(this.music);
        assertEquals(60, this.stock.calculateProfits(), 0.1);
    }
}
