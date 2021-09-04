package com.shivank.functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (a, b) -> a.concat(b);
        System.out.println(biFunction.apply("Hello ", "world"));
    }
}
