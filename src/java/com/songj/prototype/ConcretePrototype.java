package com.songj.prototype;

public class ConcretePrototype extends Prototype {
    private String name;
    @Override
    public Prototype clone() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.name = this.name;
        return prototype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                '}';
    }
}
