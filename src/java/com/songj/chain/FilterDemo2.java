package com.songj.chain;

public class FilterDemo2 implements Filter {
    @Override
    public void doFilter(Object target, FilterChain filterChain) {
        System.out.println("FilterDemo2执行...");
        filterChain.doFilter(target);
    }

    @Override
    public String getName() {
        return "FilterDemo2";
    }
}
