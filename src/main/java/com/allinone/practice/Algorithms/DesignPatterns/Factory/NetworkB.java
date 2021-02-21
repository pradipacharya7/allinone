package com.allinone.practice.Algorithms.DesignPatterns.Factory;

public class NetworkB implements Network{
    double rate=13;
    @Override
    public double getTotal(float time) {
        return time*rate*.07+time*rate;
    }
}
