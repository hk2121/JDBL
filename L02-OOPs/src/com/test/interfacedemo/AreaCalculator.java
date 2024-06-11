package com.test.interfacedemo;

public class AreaCalculator {
    private final double pi = 3.14;
    public double area(double r){
//        return 3.14*r*r;
        return pi*r*r;
    }
    public double area(double a, double b){
        return a*b;
    }
}
