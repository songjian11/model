package com.songj.factory.log;

/**
 * 以文件的形式记录日志
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件的形式记录日志");
    }
}
