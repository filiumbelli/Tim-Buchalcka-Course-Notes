package com.company;

public class Main {

    public static void main(String[] args) {
        SafeCounterWithoutLock safe = new SafeCounterWithoutLock();
        safe.increment();
        safe.secondIncrement();
        safe.decrement();
        System.out.println(safe.getValue());
        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 50; i++) {
                    int randVal = (int) (Math.random() * 10);
                    if (randVal > 5) {
                        safe.decrement();
                    } else {
                        safe.increment();
                    }
                    System.out.println("First Thread:" + safe.getValue());


                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    int randVal = (int) (Math.random() * 10);
                    if (randVal > 5) {
                        safe.decrement();
                    } else {
                        safe.increment();
                    }
                    System.out.println("Second Thread:" +safe.getValue());

                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    int randVal = (int) (Math.random() * 10);
                    if (randVal > 5) {
                        safe.decrement();
                    } else {
                        safe.increment();
                    }
                    System.out.println("Third Thread:" +safe.getValue());

                }
            }
        }).start();
    }


}
