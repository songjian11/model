package com.songj.proxy;

import java.lang.reflect.InvocationHandler;

public abstract class Handle implements InvocationHandler {
    abstract void preHandle();

    abstract void afterHandle();

    abstract void roundHandle();

    abstract void exceptionHandle();
}
