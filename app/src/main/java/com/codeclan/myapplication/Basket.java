package com.codeclan.myapplication;

/* I thought the most straightforward way to implement the necessary functionality for the basket
was to make it an array, or more specifically an ArrayList.  I considered a HashMap with keys for
the items and costs for the values, but splitting the items into separate classes and wrapping them
in an interface seemed like a better solution
  */


import java.util.ArrayList;

public class Basket {

    ArrayList<Purchasables> basketArray;

    public Basket(){
        this.basketArray = new ArrayList<Purchasables>();
    }

}
