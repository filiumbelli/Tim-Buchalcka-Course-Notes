package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Item item1 = new Item(500,5);
        Item item2 = new Item(600,2);
        Item item3 = new Item(100,2);
        Item item4 = new Item(2500,2);
        ArrayList<Item> items = new ArrayList();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        System.out.println(item1.compareTo(item2));
        if(item1.compareTo(item2) < 0){
            System.out.println(false);
        }
        Collections.sort(items);
        for(Item it : items){
            System.out.println("Item price: " + it.getPrice());
        }

        Vehicle car = new Vehicle(15);
        System.out.println(car.canMove(-5));
        System.out.println(car.canMove());
        System.out.println(car.MAX_SPEED );
        Vehicle car2 = car.clone();
        System.out.println(car2.canMove());
        System.out.println(car2.powerOn());

    }
}
