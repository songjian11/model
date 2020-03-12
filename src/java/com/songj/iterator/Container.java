package com.songj.iterator;

import java.util.*;

public class Container<T> implements Collection<T> {
    // 存储容器
    private Object[] container;
    // 记录保存数据个数
    private int size = 0;

    private static final int DEFAULT_SIZE = 10;

    private static final Object[] EMPTY_ELEMENTDATA = {};

    public Container() {
        this.container = new Object[DEFAULT_SIZE];
    }

    public Container(int initialCapacity){
        if (initialCapacity > 0) {
            this.container = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.container = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new ContainerIterator<T>();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(container, this.size);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        if(a.length >= this.size){
            return (T1[]) Arrays.copyOf(container, this.size, a.getClass());
        }
        System.arraycopy(this.container, 0, a, 0, this.size);
        if(a.length < this.size){
            a[size] = null;
        }
        return a;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if(index >= 0){
            this.container[index-1] = null;
            sort(index);
            size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (int i = 0; i < this.size; i++){
            if(!c.contains(this.container[i])){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return batchRemove(c, false);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return batchRemove(c, true);
    }

    @Override
    public void clear() {
        for(int i = 0; i < this.size; i++){
            this.container[i] = null;
        }
        this.size = 0;
    }

    private class ContainerIterator<T> implements Iterator<T>{
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }

    private int indexOf(Object o){
        if(null == o){
            for(int i = 1; i < this.size; i++){
                if(null == this.container[i]){
                    return i;
                }
            }
        }else{
            for(int i = 1; i < this.size; i++){
                if(o.equals(this.container[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    private void sort(int index){
        if(index < this.size){
            for(int i = index-1; i < this.size; i++){
                this.container[i] = container[i+1];
                this.container = Arrays.copyOf(this.container, this.size - 1);
            }
        }else{
            this.container = Arrays.copyOf(this.container, this.size - 1);
        }
    }

    /**
     * 删除元素
     * @param c 集合
     * @param complement true:表示容器保留在c集合里面的元素，false:表示容器删除在c集合里面的元素
     */
    private boolean batchRemove(Collection<?> c, boolean complement){
        boolean flag = false;
        final Object[] temp = this.container;
        int w = 0, r = 0;
        for(;r < this.size; r++){
            if(c.contains(temp[r]) == complement){
                temp[w++] = temp[r];
            }
        }
        if(w != this.size){
            for(; w < this.size; w++){
                temp[w] = null;
            }
            this.size = w;
            flag = true;
        }
        return flag;
    }

    private void ensureCapacityInternal(int count){
        if(count > this.size){

        }
    }
}
