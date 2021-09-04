package com.shivank.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> c1 = (str) -> System.out.println(str.toUpperCase());
        c1.accept("java 8");
    }
}
