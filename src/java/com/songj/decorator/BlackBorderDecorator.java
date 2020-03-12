package com.songj.decorator;

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.println("增加黑边框");
        component.display();
    }
}
