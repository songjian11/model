package com.songj.mediator;


public abstract class AbstractComponent {
    protected Mediator mediator;

    public AbstractComponent(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void update();

    abstract void action();
}
