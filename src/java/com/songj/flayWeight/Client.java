package com.songj.flayWeight;

public class Client {
    public static void main(String[] args) {
        HumanState state = new HumanState("hehe", 18);
        People people1 = PeopleFactory.createPeople("男");
        People people2 = PeopleFactory.createPeople("男");
        People people3 = PeopleFactory.createPeople("女");
        people1.state(state);
        state.setName("kk");
        state.setAge(17);
        people2.state(state);
        state.setName("ww");
        state.setAge(20);
        people3.state(state);
        System.out.println(people1 == people2);
        System.out.println(people1 == people3);
    }
}
