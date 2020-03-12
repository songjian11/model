package com.songj.factory.log;

public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
