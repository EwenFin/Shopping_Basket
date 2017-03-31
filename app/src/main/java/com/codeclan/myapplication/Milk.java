package com.codeclan.myapplication;



public class Milk implements Purchasables{

    public int price;
    public boolean bogof;

    public Milk(int price, boolean bogof){
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
