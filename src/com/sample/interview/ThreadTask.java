package com.sample.interview;

import java.util.concurrent.Callable;

public class ThreadTask implements Callable<String> {
    @Override
    public String call() {
        for (int i = 0; i < 50000; i++) {
            System.out.println("Print from thread name : "+Thread.currentThread().getName());
        }
        return "My task completed";
    }
}
