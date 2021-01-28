package com.polymorphism;

import java.awt.*;
import java.util.ArrayList;

public class Training {
    public enum Size {
        SMALL("S"),
        MEDIUM("M"),
        LARGE("L"),
        EXTRA_LARGE("XL");
        private String abbreviation;

        Size(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviation;
        }
    }

    public static void main(String[] args) {
        String s = "Okey";
        String s2 = new String("Okey");
        System.out.println(s.hashCode());
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.hashCode());
        System.out.println("S2: " + s2.hashCode());
        System.out.println(Employee.class.getName());
        Point p = new Point(15, 25);
        System.out.println(p.toString());
        System.out.println(p.distance(new Point(12, 10)));
        System.out.println(Math.class.getClass());
        System.out.println(Manager.class.getSuperclass());
        System.out.printf("%d %s", 15551, "Hello");
        System.out.println();
    }

}

