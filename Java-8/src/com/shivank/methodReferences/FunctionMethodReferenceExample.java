package com.shivank.methodReferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    public static void main(String[] args) {
        Function<String, String> function = String::toUpperCase;
        System.out.println(function.apply("java8"));
    }
}
