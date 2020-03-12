package com.songj.prototype.oa;

import java.io.Serializable;

public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "name='" + name + '\'' +
                '}';
    }
}
