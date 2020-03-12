package com.songj.builder.actor;

public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    /*public Actor getResult(){
        return this.actor;
    };*/

    public Actor getResult(){
        this.buildType();
        this.buildSex();
        this.buildFace();
        this.buildCostume();
        this.buildHairstyle();
        return actor;
    };
}
