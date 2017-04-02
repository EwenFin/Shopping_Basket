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


    }

    //total 2437

    @Test
    public void testBasketBecomesShopping(){
        basket.basketArray.add(chocolate);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(milk);
        checkout = new Checkout(customer1, basket);
        assertEquals(3, checkout.getShopping().size());
    }

    @Test
    public void testTotalBasketValueNoDiscounts(){
        basket.basketArray.add(chocolate);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(milk);
        checkout = new Checkout(customer1, basket);
        assertEquals(639, checkout.getTotalCost());
    }

    @Test
    public void test10PercentDiscount(){
        basket.basketArray.add(chocolate);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(milk);
        basket.basketArray.add(beer);
        basket.basketArray.add(itemA);
        checkout = new Checkout(customer1, basket);
        assertEquals(2194, checkout.getTotalCost());

    }

//    @Test
//    public void testCountFreeItems(){
//        basket.basketArray.add(chocolate);
//        basket.basketArray.add(pepperoniPizza);
//        basket.basketArray.add(pepperoniPizza);
//        checkout = new Checkout(customer1, basket);
//        assertEquals(1, checkout.getBogofDiscount());
//    }

    @Test
    public void testBogofDisount() {
        basket.basketArray.clear();
        basket.basketArray.add(chocolate);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(pepperoniPizza);
        checkout = new Checkout(customer1, basket);
        assertEquals(450, checkout.getBogofDiscount());
    }


    @Test
    public void testBogof3items() {
        basket.basketArray.add(chocolate);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(milk);
        basket.basketArray.add(beer);
        basket.basketArray.add(itemA);
        checkout = new Checkout(customer1, basket);
        assertEquals(2599, checkout.getTotalCost());
    }

    @Test
    public void testBogof5items() {
        basket.basketArray.add(chocolate);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(milk);
        basket.basketArray.add(beer);
        basket.basketArray.add(itemA);
        checkout = new Checkout(customer1, basket);
        assertEquals(3004, checkout.getTotalCost());

    }



}
