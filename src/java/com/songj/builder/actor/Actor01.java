package com.songj.builder.actor;

/**
 * 建造者模型的变种，省略了钩子，
 * 指挥者自由组装
 */
public class Actor01 {
    private String type;

    private String sex;

    private String face;

    private String costume;

    private String hairstyle;

    private Actor01(Builder builder) {
        this.type = builder.type;
        this.sex = builder.sex;
        this.face = builder.face;
        this.costume = builder.costume;
        this.hairstyle = builder.hairstyle;
    }

    static class Builder{
        private String type;

        private String sex;

        private String face;

        private String costume;

        private String hairstyle;

        public Builder buildType(String type) {
            this.type = type;
            return this;
        }

        public Builder buildSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder buildFace(String face) {
            this.face = face;
            return this;
        }

        public Builder buildCostume(String costume) {
            this.costume = costume;
            return this;
        }

        public Builder setHairstyle(String hairstyle) {
            this.hairstyle = hairstyle;
            return this;
        }

        public Actor01 build(){
            return new Actor01(this);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }
}
