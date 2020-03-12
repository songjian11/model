package com.songj.facade;

public class Car implements Animal {
    @Override
    public void say() {
        System.out.println("喵喵");
    }
}
