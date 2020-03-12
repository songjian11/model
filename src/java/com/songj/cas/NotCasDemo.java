package com.songj.cas;

public class NotCasDemo {
    private static Integer count = 0;

    public static boolean add() throws InterruptedException {
        Thread.sleep(100);
        count ++;
        return true;
    }

    public static Integer get(){
        return count;
    }

    public static boolean remove(){
        count--;
        return true;
    }
}
