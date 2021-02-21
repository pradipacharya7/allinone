package com.allinone.practice.Algorithms.DesignPatterns.Factory;
/*
1.make an interface or abstract class
2.make sub classes
3.make an object of interface or abstract class
4.create a class defining factroy method with parameter
5.call factory method passing parameter
 */
public class FactoryMethod {
    public Network getInstance(String type){
        if(type.equals("NetworkA"))
            return new NetworkA();
        else return new NetworkB();

    }
}
