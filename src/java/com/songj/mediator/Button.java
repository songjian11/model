package com.songj.mediator;

public class Button extends AbstractComponent {
    public Button(Mediator mediator) {
        super(mediator);
    }

    @Override
    void update() {
        System.out.println("按钮执行");
        mediator.componentChanged(this);
    }

    @Override
    void action() {
        System.out.println("按钮执行...");
    }
}
