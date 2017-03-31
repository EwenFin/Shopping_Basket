package com.codeclan.myapplication;


public class Customer {

    public String name;
    public boolean loyaltyCard;

    public Customer(String name){
        this.name = name;
        this.loyaltyCard = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasLoyaltyCard() {
        return loyaltyCard;
    }

    public void setLoyaltyCard(boolean loyalty_card) {
        this.loyaltyCard = loyalty_card;
    }
}
