package com.gf.factory.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory  = new SimpleFactory();
        System.out.println(factory.getCar("奔驰"));
    }
}
