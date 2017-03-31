package com.codeclan.myapplication;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GenericShoppingItemATest {
    GenericShoppingItemA itemA;

    @Before
    public void before() {
        itemA = new GenericShoppingItemA(1099, false);
    }

    @Test
    public void testBeerPrice() {
        assertEquals(1099, itemA.getPrice());
    }

    @Test
    public void testIsBogof() {
        assertEquals(false, itemA.isBogof());
    }
}

