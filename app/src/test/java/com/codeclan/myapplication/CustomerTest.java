package com.codeclan.myapplication;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class CustomerTest {
    Customer customer1;
    Customer customer2;

    @Before
    public void before(){
        customer1 = new Customer("Ewen");
        customer2 = new Customer("Bob");

    }

    @Test
    public void testName(){
        assertEquals("Ewen", customer1.getName());
    }

    @Test
    public void testStartWithoutLoyaltyCard(){
        assertEquals(false, customer1.hasLoyaltyCard());
    }

    @Test
    public void testCanAddLoyaltyCard(){
        customer1.setLoyaltyCard(true);
        assertEquals(true, customer1.hasLoyaltyCard());
    }


}
