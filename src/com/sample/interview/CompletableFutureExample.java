package com.sample.interview;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture.supplyAsync(() -> " Hello ")
                .thenApply(String::trim)
                .thenApply(String::toUpperCase)
                .thenAccept(System.out::println)
                .join();

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "Sushant");
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "Kadam");

        CompletableFuture<String> result = f1.thenCombine(f2, (a, b) -> a +" "+b);

        // blocking operation
        //System.out.println("Result : "+result.get());

        System.out.println(result.join());


        CompletableFuture<String> f3 = CompletableFuture.supplyAsync(() -> {
            if(Math.random() > 0.5 ) throw new RuntimeException("Failed");
            return "Success";
        }).exceptionally( ex -> {
            System.out.println("Error : "+ex.getMessage());
            return "Fallback";
        });

        System.out.println(f3.join());

    }
}
