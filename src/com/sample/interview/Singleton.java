package com.sample.interview;

public class Singleton {

    private Singleton() {}

    /**
     * This is simple way to create singleton
     */
//    private final static Singleton instance = new Singleton();
//
//    public static Singleton getSingleton() {
//        return instance;
//    }

    private static Singleton instance;

    /**
     * Thread safe with double check locking principle
     * @return instanceOfSingleton
     */
    public static Singleton getSingleton() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void print() {
        System.out.println("Singleton print method called");
    }
}
