package com.allinone.practice.Algorithms.DesignPatterns.Factory;

import sun.nio.ch.Net;

public class NetworkA implements Network {
    double rate=12;

    @Override
    public double getTotal(float time) {
        return time*rate*.07+time*rate;
    }
}
