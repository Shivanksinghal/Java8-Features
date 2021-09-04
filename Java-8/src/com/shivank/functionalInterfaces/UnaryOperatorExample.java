package com.shivank.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        // input and output are of the same type
        UnaryOperator<String> unaryOperator = (s) -> s.concat("Default");
        System.out.println(unaryOperator.apply("Java8"));
    }
}
