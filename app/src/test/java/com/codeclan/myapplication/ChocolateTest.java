package com.codeclan.myapplication;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ChocolateTest {
    Chocolate chocolate;

    @Before
    public void before(){
        chocolate = new Chocolate(100, false);
    }

    @Test
    public void testMilkPrice(){
        assertEquals(100, chocolate.getPrice());
    }

    @Test
    public void testIsBogof() {
        assertEquals(false, chocolate.isBogof());
    }


}
