package com.songj.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
public abstract class Aop implements InvocationHandler{
    private String methodName;

    public Aop(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(Match.isBeforeMatch(methodName, method)){
            before();
        }
        Object result = method.invoke(proxy, args);
        if(Match.isAfterMatch(methodName, method)){
            after();
        }
        return result;
    }

    public abstract void before();

    public abstract void after();
}
