package com.songj.observer;

public class ConcreteSubject extends Subject {
    @Override
    public void action() {
        for(Observer observer : list){
            observer.update();
        }
    }
}
