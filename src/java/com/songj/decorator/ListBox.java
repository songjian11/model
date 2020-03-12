package com.songj.decorator;

public class ListBox implements Component {
    @Override
    public void display() {
        System.out.println("显示列表");
    }
}
