package com.codeclan.myapplication;

/* I thought about adding the value and discount functionality to the basket,
 creating some kind of "Smart Basket" class but that seemed to violate Single Responsibility */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Checkout {
    int total;
    ArrayList<Purchasables> shopping;

    public Checkout(Customer customer, Basket basket){
        this.total = 0;
        this.shopping = basket.basketArray;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<Purchasables> getShopping() {
        return shopping;
    }


    public int getBogofDiscount(){
        int discount = 0;
        int numberOfFreeItems = 0;
        Set<Purchasables> shoppingSet = new HashSet<Purchasables>(shopping);
        for(Purchasables shoppingItems: shoppingSet ) {

            if (shoppingItems.isBogof())

                numberOfFreeItems = numberOfFreeItems + (Collections.frequency(shopping, shoppingItems)/2);
                discount = discount  + (numberOfFreeItems * shoppingItems.getPrice());
            }


        return discount;
    }


    public int getTotalCost(){
        int total = 0;
        for(int i = 0; i < shopping.size(); i++) {
            total = total + shopping.get(i).getPrice();


        }
        total = total - getBogofDiscount();
        if(total >= 2000){
            total = total - (total / 10);
        }
        return total;
    }
}
