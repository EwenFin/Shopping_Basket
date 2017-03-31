package com.codeclan.myapplication;


public class Customer {

    public String name;
    public boolean loyalty_card;

    public Customer(String name){
        this.name = name;
        this.loyalty_card = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasLoyalty_card() {
        return loyalty_card;
    }

    public void setLoyalty_card(boolean loyalty_card) {
        this.loyalty_card = loyalty_card;
    }
}
