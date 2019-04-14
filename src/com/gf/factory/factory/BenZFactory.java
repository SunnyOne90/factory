package com.gf.factory.factory;

import com.gf.factory.Benz;
import com.gf.factory.Car;

public class BenZFactory implements Car {
    @Override
    public void cat() {
        new Benz();
    }
}
