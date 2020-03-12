package com.songj.flayWeight;

public class Man extends People {
    private String sex;

    public Man() {
        this.sex = "男性";
    }

    @Override
    String getSex() {
        return this.sex;
    }

    /**
     * 进行业务操作
     * @param state
     */
    @Override
    void state(HumanState state) {
        System.out.println("name:" + state.getName() + ",sex:" + this.sex + ",age:" + state.getAge());
    }
}
