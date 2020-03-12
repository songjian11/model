package com.songj.facade;

public class Child implements Human {
    @Override
    public void move() {
        System.out.println("慢慢移动");
    }
}
