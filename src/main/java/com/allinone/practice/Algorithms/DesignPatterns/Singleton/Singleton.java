package com.allinone.practice.Algorithms.DesignPatterns.Singleton;
/*
1.Make constructor private.
2.Make a private static instance of class  using new operator.
3.Make a static access point.
 */
public class Singleton {
    private final static Singleton singleton=new Singleton();

    private Singleton(){}
    public static Singleton accesspoint(){
        return singleton;
    }
    public void method(){
        System.out.println("this is method inside singleton class");
    }
}
