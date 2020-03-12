package com.songj.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> list = new ArrayList<>();

    public void add(Observer observer){
        this.list.add(observer);
    }

    public void delete(Observer observer){
        this.list.remove(observer);
    }

    public abstract void action();
}
