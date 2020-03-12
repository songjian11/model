package com.songj;

import com.songj.flayWeight.People;

import java.util.ArrayList;
import java.util.List;

public class Demo01<T> {
    public static void main(String[] args) {
        Demo01<Integer> demo01 = new Demo01<>();
        Demo01<String> demo02 = new Demo01<>();
        Demo01.test1("ssss");
        Demo01.test1("sssskkkk");
    }


    public static <T> T test1(T str){
        System.out.println(str.toString());
        return null;
    }
}
