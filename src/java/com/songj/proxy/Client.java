package com.songj.proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
//        Handle handle = new CommenHandle(new UserDaoImpl());
//        UserDao proxy = (UserDao) Proxy.newProxyInstance(UserDaoImpl.class.getClassLoader(), UserDaoImpl.class.getInterfaces(), handle);
//        System.out.println(proxy.printUserName());

        UserDao proxy = (UserDao) FactoryBean.getObject();
        System.out.println(proxy.printUserName());
    }
}
