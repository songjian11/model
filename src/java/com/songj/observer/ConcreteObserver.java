package com.songj.observer;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + "执行了。。。");
    }
}
