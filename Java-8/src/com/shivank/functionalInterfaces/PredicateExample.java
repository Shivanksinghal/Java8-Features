package com.shivank.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (i) -> i % 2 == 0;
        System.out.println(predicate.test(4));

        Predicate<Integer> p2 = (i) -> i % 5 == 0;

        System.out.println(predicate.and(p2).test(12));

        System.out.println(predicate.or(p2).test(10));

        System.out.println(predicate.negate().test(11));
    }
}
