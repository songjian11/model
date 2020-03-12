package com.songj.decorator;

public class TextBox implements Component {
    @Override
    public void display() {
        System.out.println("显示文本");
    }

    public void print(){
        System.out.println("hello world");
    }
}
