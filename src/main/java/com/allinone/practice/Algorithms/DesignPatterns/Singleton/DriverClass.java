package com.allinone.practice.Algorithms.DesignPatterns.Singleton;

public class DriverClass {
    public static void main(String[] args) {
        Singleton singleton=  Singleton.accesspoint();
        singleton.method();


    }
}
