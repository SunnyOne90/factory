package com.gf.factory.abstractFactory;

import com.gf.factory.Audi;
import com.gf.factory.Benz;
import com.gf.factory.Bmw;
import com.gf.factory.Car;

public class Factory extends AbstractFactory{
    @Override
    public Car getBmw() {
       return new Bmw();
    }

    @Override
    public Car getBenZ() {
        return new Benz();
    }

    @Override
    public Car getAudi() {
        return new Audi();
    }
}
