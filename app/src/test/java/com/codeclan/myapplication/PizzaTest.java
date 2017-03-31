package com.codeclan.myapplication;



import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PizzaTest {
    Pizza pizza;

    @Before
    public void before(){
        pizza = new Pizza(350, true);
    }

    @Test
    public void testPizzaPrice(){
        assertEquals(350, pizza.getPrice());
    }

    @Test
    public void testIsBogof(){
        assertEquals(true, pizza.isBogof());
    }





}
