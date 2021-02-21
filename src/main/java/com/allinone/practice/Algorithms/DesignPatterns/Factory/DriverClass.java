package com.allinone.practice.Algorithms.DesignPatterns.Factory;

public class DriverClass {
    public static void main(String[] args) {
        FactoryMethod factoryMethod=new FactoryMethod();
        String networkType="NetworkA";
        Network network=factoryMethod.getInstance( networkType);
        network.getTotal(10);
        System.out.println( "Network A "+network.getTotal(10));
        String networkType2="NetworkB";
        Network network2=factoryMethod.getInstance( networkType2);
        network.getTotal(12);
        System.out.println( "Network B "+network2.getTotal(10));
    }


}
