package com.songj.mediator;

public class List extends AbstractComponent {
    public List(Mediator mediator) {
        super(mediator);
    }

    @Override
    void update() {
        System.out.println("列表执行");
        mediator.componentChanged(this);
    }

    @Override
    void action() {
        System.out.println("列表执行");
    }
}
