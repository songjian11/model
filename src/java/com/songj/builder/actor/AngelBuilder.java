package com.songj.builder.actor;

public class AngelBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        this.actor.setType("天使");
    }

    @Override
    public void buildSex() {
        this.actor.setSex("女");
    }

    @Override
    public void buildFace() {
        this.actor.setFace("可爱");
    }

    @Override
    public void buildCostume() {
        this.actor.setCostume("天丝蚕衣");
    }

    @Override
    public void buildHairstyle() {
        this.actor.setHairstyle("长发飘飘");
    }
}
