package com.songj.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum Singleton5 {
    SINGLETON_5;

    Singleton5() {
        System.out.println("hello world");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton5 single = Singleton5.SINGLETON_5;
        Constructor constructor = Singleton5.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton5 copy = (Singleton5)constructor.newInstance();
        System.out.println(copy == single);
    }
}
