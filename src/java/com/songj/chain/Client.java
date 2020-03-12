package com.songj.chain;


import java.util.ArrayList;
import java.util.List;

public class Client {
    private static Handle handle;
    // 模拟spring创建过滤器过程
    static {
        List<Filter> filters = new ArrayList<>();
        Filter filter1 = new FilterDemo1();
        Filter filter2 = new FilterDemo2();
        Filter filter3 = new FilterDemo3();
        filters.add(filter1);
        filters.add(filter2);
        filters.add(filter3);
        // 创建责任链
        DefaultFilterChain filterChain = new DefaultFilterChain(filters);
        // 将责任链配置到处理类中
        handle = new Handle(filterChain);
    }

    public static void main(String[] args) {
        // 模拟接收到请求
        handle.handleRequest(null);
    }
}
