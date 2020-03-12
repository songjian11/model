package com.songj.factory.log;

public class DataBaseLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DataBaseLogger();
    }
}
