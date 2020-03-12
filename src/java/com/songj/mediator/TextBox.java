package com.songj.mediator;

public class TextBox extends AbstractComponent {
    public TextBox(Mediator mediator) {
        super(mediator);
    }

    @Override
    void update() {
        System.out.println("文本框执行");
        mediator.componentChanged(this);
    }

    @Override
    void action() {
        System.out.println("文本框执行");
    }
}
