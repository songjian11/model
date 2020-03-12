package com.songj.proxy;

import java.lang.reflect.Method;

public class Match {
    public static boolean isBeforeMatch(String methodName, Method method){
        if(methodName.equals(method.getName())){
            return true;
        }
        return false;
    }

    public static boolean isAfterMatch(String methodName, Method method){
        if(methodName.equals(method.getName())){
            return true;
        }
        return false;
    }
}
