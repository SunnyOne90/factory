package com.gf.factory.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory = new Factory();
        System.out.println(factory.getAudi());
        System.out.println(factory.getBenZ());
        System.out.println(factory.getBmw());
    }
}
