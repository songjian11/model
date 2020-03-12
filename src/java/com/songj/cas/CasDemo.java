package com.songj.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasDemo {
    private static Integer count = 0;
    private static volatile AtomicInteger version = new AtomicInteger(0);

    public static boolean add(int version) throws InterruptedException {
        Thread.sleep(100);
        boolean flag = CasDemo.version.compareAndSet(version, version + 1);
        if(flag){
            count ++;
            return true;
        }
        return false;
    }

    public static Integer get(){
        return count;
    }

    public static boolean remove(int version){
        if(CasDemo.version.compareAndSet(version, version + 1)){
            count--;
            return true;
        }
        return false;
    }

    public static int getVersion(){
        return version.get();
    }
}
