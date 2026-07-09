package com.sample.interview;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> cm = str -> System.out.println(str.toUpperCase());

        cm.accept("Sushant");
    }
}
