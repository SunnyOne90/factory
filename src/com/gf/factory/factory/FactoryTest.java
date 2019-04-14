package com.gf.factory.factory;

import com.gf.factory.Car;

public class FactoryTest {
    public static void main(String[] args) {
        Car audi = new AudiFactory();
        System.out.println(audi);
        Car bmw = new BmwFactory();
        System.out.println(bmw);
        Car benZ = new BenZFactory();
        System.out.println(benZ);
    }
}
