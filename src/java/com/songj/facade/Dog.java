package com.songj.facade;

public class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("汪汪");
    }
}
