package com.songj.decorator;

public abstract class ComponentDecorator implements Component {
    protected Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }
}
