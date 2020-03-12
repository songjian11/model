package com.songj.factory.log;

/**
 * 工厂方法模式(隐藏工厂产品的业务逻辑，客户端直接调用工厂类即可完成操作)：工厂不在是单个的类，而是引入抽象或者接口工厂类，
 * 具体对象的创建延迟到具体子类，每一子类指针于某一类型的对象创建
 * 好处：增加不同类型的对象时，只需要增加具体工厂子类和该对象类，
 * 不需要修改工厂方法
 * 缺点：增加了代码量，每增加一种类型就要增加相应的工厂类
 * 以日志为例
 */
public class Client {
    public static void main(String[]
                                    args) {
        LoggerFactory logger1 = new FileLoggerFactory();
        LoggerFactory logger2 = new DataBaseLoggerFactory();
        logger1.writeLog();
        logger2.writeLog();
    }
}
