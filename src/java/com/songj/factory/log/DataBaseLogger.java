package com.songj.factory.log;

/**
 * 以数据库的方式记录日志
 */
public class DataBaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库的形式记录日志");
    }
}
