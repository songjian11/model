package com.songj.builder.actor;

public class ActorControl {
    public static Actor construct(ActorBuilder builder){
        builder.buildType();
        builder.buildCostume();
        builder.buildFace();
        builder.buildSex();
        builder.buildHairstyle();
        return builder.getResult();
    }
}
