package com.sample;

public interface Interface1 {

    public String display();

    public void useMe();

    default int run(int a, int b) {
        return  a + b;
    }

    static void showMe(String str) {
        System.out.println(str);
    }

}
