package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
//    private static Object lock = new Object();
    private static ReentrantLock lock = new ReentrantLock(true);
    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker(),"Priority:10");
        Thread t2 = new Thread(new Worker(),"Priority:6");
        Thread t3 = new Thread(new Worker(),"Priority:5");
        Thread t4 = new Thread(new Worker(),"Priority:8");
        Thread t5 = new Thread(new Worker(),"Priority:4");

        //
        t1.setPriority(10);
        t2.setPriority(6);
        t3.setPriority(5);
        t4.setPriority(8);
        t5.setPriority(4);

        t1.start();
        t4.start();
        t2.start();
        t3.start();
        t5.start();

    }

    private static class Worker implements Runnable {
        private int runCount = 1;

        @Override
        public void run() {
            for (int i = 100; i > 0; i--) {
                lock.lock();
                try{
                    System.out.format("Counting %d. Current thread: %s\n", i, Thread.currentThread().getName());
                }finally{
                    lock.unlock();
                }
            }
        }
    }
}
