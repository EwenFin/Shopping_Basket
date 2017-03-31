package com.codeclan.myapplication;


public class GenericShoppingItemA implements Purchasables {

        public int price;
        public boolean bogof;

        public GenericShoppingItemA(int price, boolean bogof){
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


