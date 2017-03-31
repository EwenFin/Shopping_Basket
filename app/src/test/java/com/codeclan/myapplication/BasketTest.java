package com.codeclan.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BasketTest {
    Basket basket;

    Chocolate chocolate;
    Pizza pepperoniPizza;
    Pizza mushroomPizza;
    Milk milk;
    GenericShoppingItemA itemA;
    Beer beer;


    @Before
    public void before(){
        basket = new Basket();
        chocolate = new Chocolate(100, false);
        pepperoniPizza = new Pizza(450, true);
        mushroomPizza = new Pizza(450, true);
        milk = new Milk(89, false);
        itemA = new GenericShoppingItemA(1099, false);
        beer = new Beer(699, false);

    }

    @Test
    public void testCanAddToBasket(){
        basket.basketArray.add(chocolate);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(mushroomPizza);
        basket.basketArray.add(milk);
        basket.basketArray.add(itemA);
        basket.basketArray.add(beer);
        assertEquals(6, basket.basketArray.size());
    }

    @Test
    public void testCanRemoveFromBasket(){
        basket.basketArray.add(chocolate);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.remove(chocolate);
        basket.basketArray.remove(pepperoniPizza);
        assertEquals(0, basket.basketArray.size());

    }

    @Test
    public void testCanEmptyBasket(){
        basket.basketArray.add(chocolate);
        basket.basketArray.add(pepperoniPizza);
        basket.basketArray.add(mushroomPizza);
        basket.basketArray.add(milk);
        basket.basketArray.add(itemA);
        basket.basketArray.add(beer);
        basket.basketArray.clear();
        assertEquals(0, basket.basketArray.size());

    }



}