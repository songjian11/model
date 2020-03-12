package com.songj.builder.actor;

public class Client {
    public static void main(String[] args) {
//        Actor actor = ActorControl.construct(new AngelBuilder());
//        System.out.println(actor.toString());

        ActorBuilder builder = new HeroBuilder();
        System.out.println(builder.getResult().toString());
    }
}
