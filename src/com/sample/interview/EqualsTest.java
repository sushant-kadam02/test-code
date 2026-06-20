package com.sample.interview;

public class EqualsTest {

    public static void main(String[] args) {
        String s1 = "Sushant";
        String s2 = "Sushant";
        String s3 = "sushant";

        String s4 = new String("Sushant");
        String s5 = new String("Sushant");

        System.out.println("s1.equals(s2) : "+s1.equals(s2));
        System.out.println("s1==s2 : " +(s1 == s2));
        System.out.println("s1==s3 : " +(s1 == s3));

        System.out.println("s1.equals s3 : "+s1.equals(s3));

        System.out.println("s1.equals s4 : "+s1.equals(s4));
        System.out.println("s4.equals s5 : "+s4.equals(s5));

        System.out.println("s4 == s5 : "+(s4 == s5));
        System.out.println("s1 == s4 : "+(s1 == s4));
    }
}
