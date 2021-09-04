package com.shivank.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(3, 4));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(6, 5));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(6, 5));
    }
}
