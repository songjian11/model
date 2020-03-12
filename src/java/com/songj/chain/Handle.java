package com.songj.chain;

public class Handle {
    private FilterChain filterChain;

    public Handle(FilterChain filterChain) {
        // 可以通过xml配置优化
        this.filterChain = filterChain;
    }

    public String handleRequest(Object target){
        this.filterChain.doFilter(target);
        return "is ok";
    }
}
