package com.codeclan.myapplication;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CheckoutTest {
    Checkout checkout;

    Basket basket;

    Chocolate chocolate;
    Pizza pepperoniPizza;
    Pizza mushroomPizza;
    Milk milk;
    GenericShoppingItemA itemA;
    Beer beer;

    Customer customer1;
    Customer customer2;

    @Before
    public void before(){

        basket = new Basket();
        chocolate = new Chocolate(100, false);
        pepperoniPizza = new Pizza(450, true);
        mushroomPizza = new Pizza(450, true);
        milk = new Milk(89, false);
        itemA = new GenericShoppingItemA(1099, false);
        beer = new Beer(699, false);
        customer1 = new Customer("Ewen");
        customer2 = new Customer("Bob");
        checkout = new Checkout(customer1, basket);
    }

    //total 2437

    @Test
    public void testTotalBasketValueNoDiscounts(){
        basket.basketArray.add(chocolate);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(milk);
        assertEquals(639, checkout.getTotalCost());
    }



}
