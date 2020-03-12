package com.songj.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("heheheheh");
        originator.createMement();
        originator.setState("kkkkkkk");
        System.out.println(originator.toString());
        originator.refresh(0);
        System.out.println(originator.toString());
    }
}
