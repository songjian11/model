package com.songj.single;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) throws Exception {
        Singleton4 singleton = Singleton4.getInstance();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(singleton);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Singleton4 copy1 = (Singleton4) ois.readObject();
        System.out.println(copy1 == singleton);

        Constructor<Singleton4> constructor = Singleton4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton4 copy2 = constructor.newInstance();
        System.out.println(copy2 == singleton);
    }
}
