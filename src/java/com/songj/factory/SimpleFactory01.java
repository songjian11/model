package com.songj.factory;

import com.songj.factory.model.Apple;
import com.songj.factory.model.Fruit;
import com.songj.factory.model.Orange;
import com.songj.factory.model.Pear;

/**
 * 简单的工厂模式1，缺点违反开闭原则，
 * 有变更时必须修改Factory的静态方法
 */
public class SimpleFactory01 {
    public static void main(String[] args) throws Exception {
        FruitFactory01.createFruit(1).print();
        FruitFactory01.createFruit(2).print();
        FruitFactory01.createFruit(3).print();
    }
}

class FruitFactory01{
    public static Fruit createFruit(int i) throws Exception {
        Fruit fruit = null;
        switch (i){
            case 1:
                fruit = new Apple();
                break;
            case 2:
                fruit = new Pear();
                break;
            case 3:
                fruit = new Orange();
                break;
            default:
                throw new Exception("没有该种类的水果");
        }
        return fruit;
    }
}








