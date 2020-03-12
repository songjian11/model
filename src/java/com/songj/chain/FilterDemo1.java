package com.songj.chain;

public class FilterDemo1 implements Filter {
    @Override
    public void doFilter(Object target, FilterChain filterChain) {
        System.out.println("FilterDemo1执行...");
        filterChain.doFilter(target);
    }

    @Override
    public String getName() {
        return "FilterDemo1";
    }
}
