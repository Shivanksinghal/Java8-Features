package com.shivank.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a: " + a + ", b: " + b);
        };
        biConsumer.accept("java7", "java8");

        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication is: " + a * b);

        BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division is: " + a / b);

        multiply.andThen(division).accept(4, 2);
    }
}
