package com.sample.interview;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> t1 = str -> str.length() > 5;

        System.out.println(t1.test("Java"));
        System.out.println(t1.test("programing"));

        Predicate<Integer> t2 = x -> x % 2 == 0;

        System.out.println("56 is even : "+t2.test(56));
        System.out.println("9 is even : "+t2.test(9));

    }
}
