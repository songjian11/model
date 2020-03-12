package com.songj.factory;

import com.songj.factory.model.Fruit;
import com.songj.factory.util.FruitXmlUtil;

import java.util.Map;

/**
 * 简单的工厂模式2，修复模式1的开闭缺陷，
 * 主要思路是通过xml配置，使对象的变更只是
 * 通过配置文件来进行变更
 * 不足之处：当创建的对象个性化的时候，需要修改工厂方法，
 * 不满足开闭原则
 */
public class SimpleFactory02 {
    public static void main(String[] args) {
        try {
            FruitFactory02.createFruit().print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class FruitFactory02{
    public static Fruit createFruit() throws Exception {
        Map<String, Fruit> map = FruitXmlUtil.getFruits();
        String type = FruitXmlUtil.getFruitType();
        return map.get(type);
    }
}


