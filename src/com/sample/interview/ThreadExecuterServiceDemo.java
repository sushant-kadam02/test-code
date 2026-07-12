package com.sample.interview;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExecuterServiceDemo {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> futureResult = executorService.submit(new ThreadTask());
        // Below is blocking call if we call .get() method immediately
        // We can get the value after executing other few task so future object will be ready with its result.
        try {
            System.out.println("Future Result is : "+futureResult.get());  // get result is blocking main thread.
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        /**
         * We have get(), get(timeout, TimeUnit), isDone(), cancel(boolean), isCancelled(boolean) method in the Future class
         * Future can accept runnable and callable both argumant but runnable does not return anything and callable return some output.
         * But on the runable we can perform isDone, cancel method to check the execution status and cancel the runable task.
         * Future is blocking the main thread while using get() till its value ready, so java introduce CompletableFuture<>
         *
         */


        for (int i = 0; i < 5; i++) {
            System.out.println("Print from thread name : "+Thread.currentThread().getName());
        }

    }
}
