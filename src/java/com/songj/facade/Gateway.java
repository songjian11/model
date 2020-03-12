package com.songj.facade;

public class Gateway extends Facade {
    private Human human;
    private Animal animal;

    public Gateway() {
        this.human = new Child();
        this.animal = new Car();
    }


    @Override
    public void move() {
        this.human.move();
    }

    @Override
    public void say() {
        this.animal.say();
    }
}
