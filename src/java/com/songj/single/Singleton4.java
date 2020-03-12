package com.songj.single;

import java.io.Serializable;

/**
 * 利用内部类做延迟加载，确保一个类一个对象
 */
public class Singleton4 implements Cloneable, Serializable {
    private Singleton4() throws Exception {
        if(null != HolderClass.singleton){
            throw new Exception("不允许创建多个实例");
        }
    }

    private static class HolderClass{
        private static Singleton4 singleton;
        static {
            try {
                singleton = new Singleton4();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Singleton4 getInstance(){
        return HolderClass.singleton;
    }

    /**
     * 防止克隆破坏单例模式
     * @return
     */
    @Override
    protected Object clone(){
        return HolderClass.singleton;
    }

    /**
     * 防止序列化破坏单例模式
     * @return
     */
    public Object readResolve(){
        return HolderClass.singleton;
    }
}
