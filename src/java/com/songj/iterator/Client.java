package com.songj.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
    }

    private static void removeAll(){
        Object[] arr = {1,2,3,4,5,6};
        Object[] arr1 = arr;
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        int w = 0, r = 0;
        for( ;r < arr.length; r++){
            if(!list.contains(arr[r])){
                arr1[w++] = arr[r];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        if (r != arr.length) {
            System.arraycopy(arr1, r,
                    arr1, w,
                    arr.length - r);
            w += arr.length - r;
        }
        if (w != arr.length) {
            // clear to let GC do its work
            for (int i = w; i < arr.length; i++)
                arr1[i] = null;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
