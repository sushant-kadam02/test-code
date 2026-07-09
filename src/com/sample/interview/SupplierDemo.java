package com.sample.interview;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> sp = Math::random;
        System.out.println("Random number : "+sp.get());
    }
}
