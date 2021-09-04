package com.shivank.functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        BiPredicate<Integer, Double> biPredicate = (a, b) -> a >= 3 && b >= 3.9;
        System.out.println(biPredicate.test(4, 3.5));
        System.out.println(biPredicate.test(4, 4.5));
    }
}
