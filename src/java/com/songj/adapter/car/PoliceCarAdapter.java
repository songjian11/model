package com.songj.adapter.car;

public class PoliceCarAdapter implements Car {
    private Sound sound;

    private Lamp lamp;

    public PoliceCarAdapter(Sound sound, Lamp lamp) {
        this.sound = sound;
        this.lamp = lamp;
    }

    @Override
    public void move() {
        System.out.println("玩具车移动");
    }

    @Override
    public void phonate() {
        sound.sound();
    }

    @Override
    public void twinkle() {
        lamp.alarmLamp();
    }
}
