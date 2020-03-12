package com.songj.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main(String[] args) throws Exception {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 5; i++){
                    while(true){
                        int version = CasDemo.getVersion();
                        try {
                            if(CasDemo.add(version)){
    //                        System.out.println("增加失败");
                                break;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 5; i++){
                    while(true){
                        int version = CasDemo.getVersion();
                        try {
                            if(CasDemo.add(version)){
    //                        System.out.println("增加失败");
                                break;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        /*Thread thread1 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 5; i++){
                    while(true){
                        try {
                            if(NotCasDemo.add()){
    //                        System.out.println("增加失败");
                                break;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 5; i++){
                    while(true){
                        try {
                            if(NotCasDemo.add()){
    //                        System.out.println("增加失败");
                                break;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };*/
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("执行结果:" + CasDemo.get());
    }
}
