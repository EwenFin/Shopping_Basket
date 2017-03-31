package com.codeclan.myapplication;



public class Pizza implements Purchasables{

    public int price;
    public boolean bogof;

    public Pizza(int price, boolean bogof) {

        this.price = price;
        this.bogof = bogof;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBogof() {
        return bogof;
    }

    public void setBogof(boolean bogof) {
        this.bogof = bogof;
    }





}
