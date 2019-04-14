package com.gf.factory.factory;

import com.gf.factory.Audi;
import com.gf.factory.Car;

public class AudiFactory implements Car {
    @Override
    public void cat() {
        new Audi();
    }
}
