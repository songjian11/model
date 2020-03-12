package com.songj.factory.log;

public abstract class LoggerFactory {
    public void writeLog(){
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    abstract Logger createLogger();
}
