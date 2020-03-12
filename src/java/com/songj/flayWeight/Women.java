package com.songj.flayWeight;

public class Women extends People {
    private String sex;

    public Women() {
        this.sex = "女性";
    }

    @Override
    String getSex() {
        return this.sex;
    }

    @Override
    void state(HumanState state) {
        System.out.println("name:" + state.getName() + ",sex:" + this.sex + ",age:" + state.getAge());
    }
}
