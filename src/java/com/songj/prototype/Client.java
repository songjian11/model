package com.songj.prototype;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype01 = new ConcretePrototype();
        prototype01.setName("songj");
        ConcretePrototype prototype02 = (ConcretePrototype)prototype01.clone();
        System.out.println(prototype01 == prototype02);
        System.out.println(prototype02.toString());
    }
}
