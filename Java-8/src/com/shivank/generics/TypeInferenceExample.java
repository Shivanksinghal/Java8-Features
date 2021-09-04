package com.shivank.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceExample {

    public static <T>List<T> add(List<T> list, T item1, T item2) {
        list.add(item1);
        list.add(item2);
        return list;
    }

    public static  <T>T get(T t1, T t2) {
        return t1;
    }

    public static void main(String[] args) {
        List<Integer> list = add(new ArrayList<>(), 20, 20);
        System.out.println(list);

        // Type witness
        TypeInferenceExample.<Integer>add(list, 30, 40);

        System.out.println(get("Hello", new ArrayList<>()).getClass());
    }
}
