package com.songj.prototype.demo;

public class People implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
