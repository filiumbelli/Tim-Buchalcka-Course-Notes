package com.company;

public class Item implements Comparable<Item>{

    private int price;
    private int stockNum;

    public Item(int price,int stockNum){
        this.price = price;
        this.stockNum = stockNum;
    }


    public int getPrice(){
        return this.price;
    }

    public int compareTo(Item i) {
        return (this.getPrice() - i.getPrice());
    }
}
