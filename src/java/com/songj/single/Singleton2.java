package com.songj.single;

/**
 * 饿汉式单例：利用静态变量在类加载的时候就已经实例化，
 * 来确保该类只有一个实例
 */
public class Singleton2 {
    private static Singleton2 singleton = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        return singleton;
    }
}
