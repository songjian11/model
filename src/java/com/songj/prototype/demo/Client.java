package com.songj.prototype.demo;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        People people = new People();
        people.setName("songjian");
        People copyPeople = (People) people.clone();
        System.out.println(copyPeople == people);
        System.out.println(people.toString());
    }
}
