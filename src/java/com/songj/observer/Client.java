package com.songj.observer;

public class Client {
    public static void main(String[] args) {
        // 推模型观察者模式
        Observer observer1 = new ConcreteObserver("kk");
        Observer observer2 = new ConcreteObserver("hh");
        Observer observer3 = new ConcreteObserver("jj");
        Subject subject = new ConcreteSubject();
        // 订阅
        subject.add(observer1);
        subject.add(observer2);
        subject.add(observer3);
        // 推送消息
        subject.action();
        // 拉模型观察者模式

    }
}
