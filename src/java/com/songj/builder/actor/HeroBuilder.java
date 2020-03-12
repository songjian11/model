package com.songj.builder.actor;

/**
 * 英雄角色的创建编辑器
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        this.actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        this.actor.setSex("男");
    }

    @Override
    public void buildFace() {
        this.actor.setFace("勇猛的脸");
    }

    @Override
    public void buildCostume() {
        this.actor.setCostume("铁质盔甲");
    }

    @Override
    public void buildHairstyle() {
        this.actor.setHairstyle("短发");
    }
}
