package com.songj.proxy;

public class TimeAop extends Aop {
    public TimeAop(String name) {
        super(name);
    }

    @Override
    public void before() {
        System.out.println("hhehh");
    }

    @Override
    public void after() {
        System.out.println("kkkk");
    }
}
