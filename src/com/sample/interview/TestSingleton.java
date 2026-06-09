package com.sample.interview;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getSingleton();
        obj1.print();

        System.out.println("Obj1 hashcode : "+obj1.hashCode());

        Singleton obj2 = Singleton.getSingleton();

        System.out.println("Obj2 hashcode : "+obj2.hashCode());

        System.out.println("Reflection can break the singleton pattern ");

        Singleton ref = null;
        Constructor[] constructors = Singleton.class.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                ref = (Singleton) constructor.newInstance();
                break;
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException |  InvocationTargetException  e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("ref hashcode :"+ref.hashCode());
    }

}


