package com.songj.mediator;

public class ComboBox extends AbstractComponent {
    public ComboBox(Mediator mediator) {
        super(mediator);
    }

    @Override
    void update() {
        System.out.println("comboBox执行");
        mediator.componentChanged(this);
    }

    @Override
    void action() {
        System.out.println("comBOX执行");
    }
}
