package com.songj.chain;

import java.util.ArrayList;
import java.util.List;

public class DefaultFilterChain implements FilterChain {
    private Filter _cur;
    private List<Filter> filters = new ArrayList<>();
    private FilterChain _nextChain;

    public DefaultFilterChain(List<Filter> filters) {
        if(filters.size() > 0){
            this._cur = filters.get(0);
            filters.remove(0);
            this.filters.addAll(filters);
            this._nextChain = new DefaultFilterChain(filters);
        }
    }

    @Override
    public void doFilter(Object target) {
        if(null != _cur){
            _cur.doFilter(target, _nextChain);
        }
    }
}
