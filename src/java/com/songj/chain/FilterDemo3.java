package com.songj.chain;

public class FilterDemo3 implements Filter {
    @Override
    public void doFilter(Object target, FilterChain filterChain) {
        System.out.println("FilterDemo3执行...");
        filterChain.doFilter(target);
    }

    @Override
    public String getName() {
        return "FilterDemo3";
    }
}
