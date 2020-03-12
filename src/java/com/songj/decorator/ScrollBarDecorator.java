package com.songj.decorator;

public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.println("增加滚动滑块");
        this.component.display();
    }
}
