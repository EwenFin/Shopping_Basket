package com.codeclan.myapplication;

/* I thought about adding the value and discount functionality to the basket,
 creating some kind of "Smart Basket" class but that seemed to violate Single Responsibility */

import java.util.ArrayList;

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

    public int getTotalCost(){
        int total = 0;
        for(int i = 0; i < shopping.size(); i++) {
            total = total + shopping.get(i).getPrice();
        }
        return total;




    }
}
