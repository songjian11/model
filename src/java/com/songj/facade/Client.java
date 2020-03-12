package com.songj.facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Gateway();
        facade.move();
        facade.say();
    }
}
