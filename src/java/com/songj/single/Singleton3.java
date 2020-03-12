package com.songj.single;

/**
 * 懒汉式单例模式:利用双重检查加同步锁确保类实例单一
 */
public class Singleton3 {
    private volatile static Singleton3 singleton = null;

    private Singleton3() {
        System.out.println("hello world");
    }

    public static Singleton3 getInstance(){
        if(null == singleton){
            synchronized (Singleton3.class){
                if(null == singleton){
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}
