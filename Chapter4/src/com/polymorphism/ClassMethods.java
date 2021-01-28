package com.polymorphism;

import java.util.Date;

public class ClassMethods {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String date = "java.util.Date";

        Class cl = Class.forName(date);
        System.out.println(cl.getName());
        System.out.println(cl.getClass());
        Object m =cl.newInstance();
        System.out.println(m);
    }
}
