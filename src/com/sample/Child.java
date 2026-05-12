package com.sample;

public class Child implements Interface1 {

    @Override
    public String display() {
        return "Display used.";
    }

    @Override
    public void useMe() {

    }

    /** TODO: This is also possible if you want to override the implementation from interface class **/
//    @Override
//    public int run(int a,int b) {
//        return a - b;
//    }

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display();
        System.out.println(c1.run(20, 10));
        Interface1.showMe("Static method executed.");
    }



}
