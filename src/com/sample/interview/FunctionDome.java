package com.sample.interview;

import java.util.function.Function;

public class FunctionDome {
    public static void main(String[] args) {
        Function<String, Integer> fn = str -> str.length();
        System.out.println("String length is : "+fn.apply("Sushant Suryakant Kadam"));
    }
}
