package com.shivank.methodReferences;

import java.util.function.Predicate;

public class PredicateMethodReferenceExample {
    static boolean fun(int a) {
        if (a > 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Predicate<Integer> p = PredicateMethodReferenceExample::fun;
        System.out.println(p.test(-1));
        System.out.println(p.test(0));
        System.out.println(p.test(1));
    }
}
