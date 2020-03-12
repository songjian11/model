package com.songj.single;

public class Singleton1 {
    private static Singleton1 singleton = null;

    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        if(null == singleton){
            singleton = new Singleton1();
        }
        return singleton;
    }
}
