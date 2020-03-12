package com.songj.chain;

public interface Filter {
    void doFilter(Object target, FilterChain filterChain);

    String getName();
}
