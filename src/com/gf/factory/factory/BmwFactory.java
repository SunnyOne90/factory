package com.gf.factory.factory;

import com.gf.factory.Bmw;
import com.gf.factory.Car;

public class BmwFactory implements Car {
    @Override
    public void cat() {
        new Bmw();
    }
}
