package com.songj.proxy;

import java.lang.reflect.Method;

public class CommenHandle extends Handle{
    private Object target;
    private Object result;

    public CommenHandle(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            preHandle();
            roundHandle();
            result = method.invoke(target, args);
            roundHandle();
            afterHandle();
            return result;
        }catch (RuntimeException e){
            exceptionHandle();
        }finally {
            throw new Exception("系统异常");
        }
    }

    @Override
    void preHandle() {

    }

    @Override
    void afterHandle() {

    }

    @Override
    void roundHandle() {

    }

    @Override
    void exceptionHandle() {

    }
}
