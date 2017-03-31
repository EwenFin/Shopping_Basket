package com.codeclan.myapplication;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MilkTest {
    Milk milk;

    @Before
    public void before(){
        milk = new Milk(89, false);
    }

    @Test
    public void testMilkPrice(){
        assertEquals(89, milk.getPrice());
    }

    @Test
    public void testIsBogof(){
        assertEquals(false, milk.isBogof());
    }





}
