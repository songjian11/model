package com.songj.decorator;

public class Client {
    public static void main(String[] args) {
        Component textBox = new TextBox();
        ScrollBarDecorator scrollBarDecorator = new ScrollBarDecorator(textBox);
        textBox.display();
    }
}
