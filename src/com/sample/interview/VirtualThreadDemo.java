package com.sample.interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
                System.out.println("Thread name : "+Thread.currentThread().getName());
                });

        t1.start();

//        Thread virtual = Thread.startVirtualThread(() -> {
//            System.out.println("Virtual thread name : "+Thread.currentThread());
//        });
//
//        virtual.join();


    }



}
