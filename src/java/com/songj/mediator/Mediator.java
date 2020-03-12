package com.songj.mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediator {
    protected Map<String, AbstractComponent> map = new HashMap<>();

    abstract void componentChanged(AbstractComponent component);

    abstract void add(String key, AbstractComponent component);
}
