package com.example.hayleyprior.stevesmusicexchange;

import com.example.hayleyprior.stevesmusicexchange.instruments.Piano;
import com.example.hayleyprior.stevesmusicexchange.equipment.Drumstick;

import org.junit.Before;
import org.junit.Test;

import static com.example.hayleyprior.stevesmusicexchange.instruments.Type.KEYBOARD;
import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 28/10/2017.
 */

public class TestShop {

    private Piano piano;
    private Drumstick sticks;
    private Shop shop;
    private Stock stock;

    @Before
    public void setUp() throws Exception {
        this.stock = new Stock();
        this.piano = new Piano(KEYBOARD, "Yamaha", "Keyboard", "Black", 100.00, 500.00);
        this.sticks = new Drumstick(8.00, 22.00);
        this.shop = new Shop("Music Shop", stock);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, this.shop.countStock());
    }

    @Test
    public void canAddStock() throws Exception {
        this.shop.addStock(this.piano);
        this.shop.addStock(this.sticks);
        assertEquals(2, this.shop.countStock());
    }

    @Test
    public void canRemoveStock() throws Exception {
        this.shop.addStock(this.piano);
        this.shop.addStock(this.sticks);
        this.shop.removeStock((this.piano));
        assertEquals(1, this.shop.countStock());
    }

    @Test
    public void canCalculateProfits() {
        this.shop.addStock(this.piano);
        this.shop.addStock(this.sticks);
        assertEquals(414.00, this.shop.calculateProfits(), 0.1);
    }

    @Test
    public void canCountStock() {
        this.shop.addStock(sticks);
        assertEquals(1, this.shop.countStock());
    }

}
