package com.songj.decorator;

/**
 * 具体构件类
 */
public class Window implements Component {
    @Override
    public void display() {
        System.out.println("显示窗口");
    }
}
