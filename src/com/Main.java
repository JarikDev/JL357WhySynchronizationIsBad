package com;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            counter.count();
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    static class Counter {
        volatile int i;
        //AtomicInteger atomicInteger=new AtomicInteger(0);
        synchronized void count() {
            i++;
        }
    }
}
