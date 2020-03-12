package com.songj.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class FactoryBean {
    private static Class clazz;
    private static InvocationHandler invocationHandler;

    static {
        // 可以通过xml优化
        clazz = UserDaoImpl.class;
        invocationHandler = new TimeAop("printUserName");
    }

    public static Object getObject(){
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), invocationHandler);
    }
}
