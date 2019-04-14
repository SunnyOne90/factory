package com.gf.factory.simplefactory;

import com.gf.factory.Audi;
import com.gf.factory.Benz;
import com.gf.factory.Bmw;
import com.gf.factory.Car;

public class SimpleFactory {

    public Car getCar(String carName){
        if("奥迪".equals(carName)){
            return new Audi();
        }else if("宝马".equals(carName)){
            return new Bmw();
        }else if("奔驰".equals(carName)){
            return new Benz();
        }else {
            System.out.println("抱歉，不能生产该产品");
        }
        return null;
    }
}
