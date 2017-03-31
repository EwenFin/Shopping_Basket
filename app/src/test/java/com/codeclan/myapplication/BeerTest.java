package com.codeclan.myapplication;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;/mport org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BeerTest {
    Beer beer;

    @Before
    public void before(){
        beer = new Beer(699, false);
    }

    @Test
    public void testMilkPrice(){
        assertEquals(89, beer.getPrice());
    }

    @Test
    public void testIsBogof(){
        assertEquals(false, beer.isBogof());
    }

