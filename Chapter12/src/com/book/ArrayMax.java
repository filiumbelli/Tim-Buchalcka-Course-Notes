package com.book;

public class ArrayMax {
    public static Pair minmax(String[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        String min = a[0];
        String max = a[0];
        for (String s : a) {
            // max min comparison
            if (min.compareToIgnoreCase(s) > 0) min = s;
            if (max.compareToIgnoreCase(s) < 0) max = s;
        }
        return new Pair(min, max);
    }

    // Generic method
    @SafeVarargs
    public static <T> T getMiddle(T... a) {
        try {
            return a[a.length / 2];
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T extends Comparable> T minValue(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T smallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (smallest.compareTo(a[i]) > 0) {
                smallest = a[i];
            }
        }
        return smallest;
    }
    public static<T extends Comparable> Pair minMaxGeneric(T[] t){
        if(t == null || t.length == 0)return null;
        T min = t[0];
        T max = t[0];
        for(int i = 1;i <t.length;i++){
            if(min.compareTo(t[i])>0)min=t[i];
            if(max.compareTo(t[i])<0)max=t[i];
        }
        return new Pair(min,max);
    }
}
