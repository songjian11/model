package com.songj.adapter.car;

import com.songj.adapter.util.CarXmlUtil;

public class Client {
    public static void main(String[] args) throws Exception {
        Car car = CarXmlUtil.getCarBean();
        car.move();
        car.phonate();
        car.twinkle();
    }
}
