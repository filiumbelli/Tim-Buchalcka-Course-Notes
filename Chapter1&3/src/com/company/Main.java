package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        // much  more faster than normal string
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            sb.append(i).append(",");
        }
        System.out.println(sb);

        int[] arr = {1,3,5,7};
        for(int a :arr){
            System.out.println(a);
        }
        System.out.println("......................................................");
        LinkedHashMap<Integer, Integer> list = new LinkedHashMap<Integer, Integer>();
        list.put(0,15);
        list.put(1,25);
        list.put(2,15);

        for(int a : list.keySet()){
            System.out.println("Key:" + a + " value:"+ list.get(a));
        }
    }

}
