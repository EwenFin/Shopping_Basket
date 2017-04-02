package com.codeclan.myapplication;

/* I thought about adding the value and discount functionality to the basket,
 creating some kind of "Smart Basket" class but that seemed to violate Single Responsibility */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
        int newDiscount = 0;
        HashMap<Purchasables, Integer> shoppingMap = new HashMap<Purchasables, Integer>();
        for(Purchasables items: shopping ) {
            Integer count = shoppingMap.get(items);
            shoppingMap.put(items, (count == null) ? 1 : count + 1);
        }
        for(Purchasables key : shoppingMap.keySet()){
            if(key.isBogof()){
                numberOfFreeItems = numberOfFreeItems + shoppingMap.get(key)/2;
                discount = discount + numberOfFreeItems * key.getPrice();
                newDiscount = newDiscount + discount;
                discount = 0;
                numberOfFreeItems = 0;
            }
        }

        return newDiscount;
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
