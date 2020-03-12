package com.songj.flayWeight;

import java.util.HashMap;
import java.util.Map;

public class PeopleFactory {
    private final static Map<String, People> map = new HashMap<>();

    static {
        People man = new Man();
        People woman = new Women();
        map.put("男", man);
        map.put("女", woman);
    }

    public static People createPeople(String sex){
        return map.get(sex);
    }
}
